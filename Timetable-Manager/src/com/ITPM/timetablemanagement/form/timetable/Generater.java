/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITPM.timetablemanagement.form.timetable;

import allocateTime_modifySessions.ConsecutiveSession;
import allocateTime_modifySessions.GroupId;
import allocateTime_modifySessions.LecturersTime;
import allocateTime_modifySessions.ParallelSession;
import allocateTime_modifySessions.SubGroupId;
import com.ITPM.timetablemanagement.form.room.room;
import com.ITPM.timetablemanagement.models.GroupNo;
import com.ITPM.timetablemanagement.models.Lecturer;
import com.ITPM.timetablemanagement.models.Session;
import com.ITPM.timetablemanagement.models.SubGroupNo;
import com.ITPM.timetablemanagement.models.Working_days_hours;
import com.ITPM.timetablemanagement.util.Constant;
import com.ITPM.timetablemanagement.util.CreateQuery;
import com.ITPM.timetablemanagement.util.DBconnection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class Generater {
    
    PreparedStatement statement;
    Connection connection;
    ResultSet resultSet;
    TimtableMenu timtableMenu = new TimtableMenu();
    
    Lecturer lecturer = new Lecturer();
    Session session = new Session();
    GroupNo group = new GroupNo();
    SubGroupNo subgroup = new SubGroupNo();
    Working_days_hours working_days_hours = new Working_days_hours();
    ConsecutiveSession consecutiveSession = new ConsecutiveSession();
    ParallelSession parallelSession = new ParallelSession();
    GroupId NAgroup = new GroupId();
    SubGroupId NAsubgroup = new SubGroupId();
    LecturersTime NAlecture = new LecturersTime();
    room room = new room();
    
    String path;
    FileWriter writer;
    BufferedWriter bw;
    
    public Map<Integer,Lecturer> _lecturesList = new Hashtable<>();
    public Map<Integer,Session> _sessionList = new Hashtable<>();
    public Map<Integer,GroupNo> _groupList = new Hashtable<>();
    public Map<Integer,SubGroupNo> _subGroupList = new Hashtable<>();
    public Map<Integer,Working_days_hours> _workDayList = new Hashtable<>();
    public Map<Integer,ConsecutiveSession> _consecutiveSessionList = new Hashtable<>();
    public Map<Integer,ParallelSession> _parallelSessionList = new Hashtable<>();
    public Map<Integer,GroupId> _NAGroupList = new Hashtable<>();
    public Map<Integer,SubGroupId> _NASubgroupList = new Hashtable<>();
    public Map<Integer,LecturersTime> _NALectureList = new Hashtable<>();
    public Map<Integer,room> _NARoomList = new Hashtable<>();
    public Map<Integer,room> _roomList = new Hashtable<>();
    public Map<Integer,room> _roomForTagList = new Hashtable<>();
    public Map<Integer,room> _roomForConsecutiveSessionList = new Hashtable<>();
    public Map<Integer,room> _roomForGroupList = new Hashtable<>();
    public Map<Integer,room> _roomForLectureList = new Hashtable<>();
    public Map<Integer,room> _roomForSessionList = new Hashtable<>();
    public Map<Integer,room> _roomForSubjectAndTagList = new Hashtable<>();
    
    public ArrayList<Session> session_list = new ArrayList<>();
    public Vector<Session> vec_session = new Vector<>();
    
    public void loadData(){

        try{
            getConnection();

            //load lectures
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_LECTURER));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                lecturer = new Lecturer();
                
                lecturer.setId(resultSet.getInt("id"));
                lecturer.setName(resultSet.getString("name"));
                lecturer.setLec_id(resultSet.getString("emp_id"));
                lecturer.setFaculty(resultSet.getString("faculty"));
                lecturer.setDepartment(resultSet.getString("department"));
                lecturer.setCenter(resultSet.getString("center"));
                lecturer.setBuilding(resultSet.getString("building"));
                lecturer.setLevel(resultSet.getString("level"));
                lecturer.setRank(resultSet.getString("rank"));

                _lecturesList.put(lecturer.getId(),lecturer);
            }
            statement.close();
            resultSet.close();

            //load sessions
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                session = new Session();
                
                session.setId(resultSet.getInt("id"));
                session.setSub(resultSet.getString("subject"));
                session.setSubc(resultSet.getString("sub_code"));
                session.setTag(resultSet.getString("tag"));
                session.setDuration(resultSet.getString("tag_duration"));
                session.setGroupID(resultSet.getString("group_id"));
                session.setSubgroupID(resultSet.getString("subgroup_id"));
                session.setStu_count(resultSet.getInt("stu_count"));

                _sessionList.put(session.getId(),session);
                session_list.add(session);
            }
            statement.close();
            resultSet.close();

            //load group IDs
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_GROUP_ID_TABLE));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                group = new GroupNo();
                
                group.setId(resultSet.getInt("id"));
                group.setgNo(resultSet.getString("gId"));

                _groupList.put(group.getId(),group);
            }
            statement.close();
            resultSet.close();

            //load subgroup IDs
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SUB_GROUP_ID_TABLE));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                subgroup = new SubGroupNo();
                
                subgroup.setId(resultSet.getInt("id"));
                subgroup.setSGno(resultSet.getString("sGid"));

                _subGroupList.put(subgroup.getId(),subgroup);
            }
            statement.close();
            resultSet.close();

            //load working das details
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_WORKING_HOUR_TABLE));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                working_days_hours = new Working_days_hours();
                
                working_days_hours.setId(resultSet.getString("id"));
                working_days_hours.setNumOfDays(resultSet.getString("days_no"));
                working_days_hours.setDays(resultSet.getString("days"));
                working_days_hours.setHour(resultSet.getString("hour"));
                working_days_hours.setMin(resultSet.getString("mins"));
                working_days_hours.setTimeSlot(resultSet.getString("slot_type"));

                _workDayList.put(Integer.parseInt(working_days_hours.getId()),working_days_hours);
            }
            statement.close();
            resultSet.close();

            //load Consecutive Session
            statement = connection.prepareStatement("select * from sp2_consecutive_session");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                consecutiveSession = new ConsecutiveSession();
                
                consecutiveSession.setId(Integer.parseInt(resultSet.getString("id")));
                consecutiveSession.setcSession(resultSet.getString("cSession"));
                consecutiveSession.setSessionID(resultSet.getString("sessionID"));
                consecutiveSession.setsGid(resultSet.getString("sGid"));

                _consecutiveSessionList.put(consecutiveSession.getId(), consecutiveSession);
            }
            statement.close();
            resultSet.close();

            //load Parallel Session
            statement = connection.prepareStatement("select * from sp2_parallel_session");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                parallelSession = new ParallelSession();
                
                parallelSession.setId(Integer.parseInt(resultSet.getString("id")));
                parallelSession.setSession(resultSet.getString("session"));
                parallelSession.setSessionID(resultSet.getString("sessionID"));
                parallelSession.setyNs(resultSet.getString("yNs"));

                _parallelSessionList.put(parallelSession.getId(), parallelSession);
            }
            statement.close();
            resultSet.close();

            //load not available time for groups
            statement = connection.prepareStatement("select * from sp2_group_wise");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                NAgroup = new GroupId();
                
                NAgroup.setId(Integer.parseInt(resultSet.getString("id")));
                NAgroup.setgId(resultSet.getString("gId"));
                NAgroup.setDay(resultSet.getString("day"));
                NAgroup.setTime_from(resultSet.getString("time_from"));
                NAgroup.setTime_to(resultSet.getString("time_to"));

                _NAGroupList.put(NAgroup.getId(), NAgroup);
            }
            statement.close();
            resultSet.close();

            //load not available time for subgroups
            statement = connection.prepareStatement("select * from sp2_sub_group_wise");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                NAsubgroup = new SubGroupId();
                
                NAsubgroup.setId(Integer.parseInt(resultSet.getString("id")));
                NAsubgroup.setsGid(resultSet.getString("sGid"));
                NAsubgroup.setDay(resultSet.getString("day"));
                NAsubgroup.setTime_from(resultSet.getString("time_from"));
                NAsubgroup.setTime_to(resultSet.getString("time_to"));

                _NASubgroupList.put(NAsubgroup.getId(), NAsubgroup);
            }
            statement.close();
            resultSet.close();

            //load not available time for lecturer
            statement = connection.prepareStatement("select * from sp2_lecturers_wise");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                NAlecture = new LecturersTime();
                
                NAlecture.setId(Integer.parseInt(resultSet.getString("id")));
                NAlecture.setLecName(resultSet.getString("lecName"));
                NAlecture.setLecId(Integer.parseInt(resultSet.getString("lecID")));
                NAlecture.setDay(resultSet.getString("day"));
                NAlecture.setTime_from(resultSet.getString("time_from"));
                NAlecture.setTime_to(resultSet.getString("time_to"));

                _NALectureList.put(NAlecture.getId(), NAlecture);
            }
            statement.close();
            resultSet.close();

            //load not available time for room
            statement = connection.prepareStatement("SELECT * FROM reservedrooms");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setRoom(resultSet.getString("room"));
                room.setStart(resultSet.getString("stime"));
                room.setEnd(resultSet.getString("etime"));

                _NARoomList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            //load all rooms
            statement = connection.prepareStatement("SELECT * FROM room");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setBuilding(resultSet.getString("building"));
                room.setType(resultSet.getString("type"));

                _roomList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            //load all rooms and Tags
            statement = connection.prepareStatement("SELECT * FROM roomsForATag");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setTag(resultSet.getString("tag"));
                room.setRoom(resultSet.getString("room"));

                _roomForTagList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            //load all room For Consecutive Session List
            statement = connection.prepareStatement("SELECT * FROM roomsforconssession");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setConsecutive(resultSet.getString("consSession"));
                room.setRoom(resultSet.getString("room"));

                _roomForConsecutiveSessionList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            //load all room For Group List
            statement = connection.prepareStatement("SELECT * FROM roomsforgroup");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setGroup(resultSet.getString("groups"));
                room.setRoom(resultSet.getString("room"));

                _roomForGroupList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            //load all room For Lecturer List
            statement = connection.prepareStatement("SELECT * FROM roomsforlecturer");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setLecture(resultSet.getString("lecturer"));
                room.setRoom(resultSet.getString("room"));

                _roomForLectureList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            //load all room For Session List
            statement = connection.prepareStatement("SELECT * FROM roomsforsession");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setSession(resultSet.getString("session"));
                room.setRoom(resultSet.getString("room"));

                _roomForSessionList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            //load all room For Subject And Tag List
            statement = connection.prepareStatement("SELECT * FROM roomssubtags");
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                room = new room();
                
                room.setId(Integer.parseInt(resultSet.getString("id")));
                room.setTag(resultSet.getString("tag"));
                room.setRoom(resultSet.getString("room"));
                room.setSubjectAndTag(resultSet.getString("subject"));

                _roomForSubjectAndTagList.put(room.getId(), room);
            }
            statement.close();
            resultSet.close();

            generate();
        }catch(ParserConfigurationException|SAXException|IOException|SQLException ex){
            Logger.getLogger(Generater.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * get database connection
     */
    public void getConnection(){
        try {
            connection = DBconnection.getConnection();
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(Generater.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void generate() throws FileNotFoundException, IOException{
        
        generateTimetable();
        /**
         * Here create folder named Timetables
         * then create html files according to group, lecture, room
         */
        path = new File("").getAbsolutePath()+"\\Timetables";
        File file = new File(path);
        file.mkdir();
        
        //create group wise html
        for(GroupNo group : _groupList.values()){
            createGroupWiseTable(group.getgNo());
        }
        //create lecture wise html
        for(Lecturer lecturer : _lecturesList.values()){
            createLectureWiseTable(lecturer.getLec_id());
        }
        //create room wise html
        for(room r: _roomList.values()){
            createRoomWiseTable(r.getType());
        }
        //create index.html
        CreateIndex();
    }
    
    public void generateTimetable(){
        String days [] = _workDayList.get(1).getDays().split(",");//get days list
        int workingHours = Integer.parseInt(_workDayList.get(1).getHour());
        int dayCount = days.length;
        
        
    }
    
    public void createGroupWiseTable(String GroupID) throws FileNotFoundException, IOException{
        
        
        writer = new FileWriter(new File(path+"\\"+GroupID+".html"));
        bw = new BufferedWriter(writer);
        
        String days [] = _workDayList.get(1).getDays().split(",");//get days list
        String Topic="";//table headers will store
        String Data="";//table data will store
       
        
        int slot = Integer.parseInt(_workDayList.get(1).getTimeSlot());
        int workingHours = Integer.parseInt(_workDayList.get(1).getHour());
        float StartTime = Float.parseFloat(_workDayList.get(1).getMin());
        int slotCount=0;
        int temp = 3;
        
        if(slot == 1){
            slotCount = workingHours;
        }
        else{
            slotCount = (workingHours*2);
        }
        
         for(int i = 0;i<days.length;i++){
                  Topic = Topic.concat("<th>"+days[i]+"</th>\n");
         }
         
         for(int i = 0;i <slotCount ;i++){
             
             
             Data = Data.concat("<tr>");
             Data = Data.concat("<td>"+(StartTime)+"0</td>");
             
             
             if(slot == 1){
                StartTime = StartTime + slot;
             }
             else{
                 if(temp == 6){
                     
                     StartTime = StartTime + 0.7f;
                     temp = 0;
                 }
                 else{
                     
                      StartTime = (float) (StartTime + 0.3);
                 }
                  temp = temp + 3;
             }
             
             for(int j =0;j<days.length;j++){
                 Data = Data.concat("<td>- X -</td>");
             }
             Data = Data.concat("</tr>");
         }
              String HEAD = "<html>"
                + "<head> "
                + "<style>"
                + "table, th, td {border: 1px solid black; padding: 0px;}\n"
                + "table {border-spacing: 1px;}"
                + "</style>"
                + "</head><body>"
                + " <table style=\"width:100%\">" +
                "<caption>"+GroupID+"</caption>"+      
                "  <tr>" +
                "    <th>Time</th>" ;
             
              String BODY = "</table> "
                + "</body></html>";
        
        String code = HEAD +""+ Topic +""+ Data +""+ BODY;
        bw.write(code);
        bw.close();
        writer.close();
    }
    
    public void createLectureWiseTable(String lectureID) throws FileNotFoundException, IOException{
        
        writer = new FileWriter(new File(path+"\\"+lectureID+".html"));
        bw = new BufferedWriter(writer);
        
        String days [] = _workDayList.get(1).getDays().split(",");//get days list
        String Topic="";//table headers will store
        String Data="";//table data will store
       
        
        int slot = Integer.parseInt(_workDayList.get(1).getTimeSlot());
        int workingHours = Integer.parseInt(_workDayList.get(1).getHour());
        float StartTime = Float.parseFloat(_workDayList.get(1).getMin());
        int slotCount=0;
       
        if(slot == 1)
            slotCount = workingHours;
        else
            slotCount = (workingHours*2);
        
        
         for(int i = 0;i<days.length;i++){
                  Topic = Topic.concat("<th>"+days[i]+"</th>\n");
              }
         for(int i = 0;i <slotCount ;i++){
             
             
             Data = Data.concat("<tr>");
             Data = Data.concat("<td>"+(StartTime)+"0</td>");
             
             if(slot == 1){
                StartTime = StartTime + slot;
             }
             else{
                 StartTime = StartTime + slot;
             }
             
             for(int j =0;j<days.length;j++){
                 Data = Data.concat("<td>Data</td>");
             }
             Data = Data.concat("</tr>");
         }
              String HEAD = "<html>"
                + "<head> "
                + "<style>"
                + "table, th, td {border: 1px solid black; padding: 0px;}\n"
                + "table {border-spacing: 1px;}"
                + "</style>"
                + "</head><body>"
                + " <table style=\"width:100%\">" +
                "<caption>"+lectureID+"</caption>"+      
                "  <tr>" +
                "    <th>Time</th>" ;
             
              String BODY = "</table> "
                + "</body></html>";
        
        String code = HEAD +""+ Topic +""+ Data +""+ BODY;
        bw.write(code);
        bw.close();
        writer.close();
    }
    
    public void createRoomWiseTable(String room) throws FileNotFoundException, IOException{
        
        
        writer = new FileWriter(new File(path+"\\"+room+".html"));
        bw = new BufferedWriter(writer);
        
        String days [] = _workDayList.get(1).getDays().split(",");//get days list
        String Topic="";//table headers will store
        String Data="";//table data will store
       
        
        int slot = Integer.parseInt(_workDayList.get(1).getTimeSlot());
        int workingHours = Integer.parseInt(_workDayList.get(1).getHour());
        float StartTime = Float.parseFloat(_workDayList.get(1).getMin());
        int slotCount=0;
       
        if(slot == 1)
            slotCount = workingHours;
        else
            slotCount = (workingHours*2);
        
        
         for(int i = 0;i<days.length;i++){
                  Topic = Topic.concat("<th>"+days[i]+"</th>\n");
              }
         for(int i = 0;i <slotCount ;i++){
             
             
             Data = Data.concat("<tr>");
             Data = Data.concat("<td>"+(StartTime)+"0</td>");
             
             if(slot == 1){
                StartTime = StartTime + slot;
             }
             else{
                 StartTime = StartTime + slot;
             }
             
             for(int j =0;j<days.length;j++){
                 Data = Data.concat("<td>Data</td>");
             }
             Data = Data.concat("</tr>");
         }
              String HEAD = "<html>"
                + "<head> "
                + "<style>"
                + "table, th, td {border: 1px solid black; padding: 0px;}\n"
                + "table {border-spacing: 1px;}"
                + "</style>"
                + "</head><body>"
                + " <table style=\"width:100%\">" +
                "<caption>"+room+"</caption>"+      
                "  <tr>" +
                "    <th>Time</th>" ;
             
              String BODY = "</table> "
                + "</body></html>";
        
        String code = HEAD +""+ Topic +""+ Data +""+ BODY;
        bw.write(code);
        bw.close();
        writer.close();
    }
    
    //create Index html
    public void CreateIndex() throws IOException{
        
        writer = new FileWriter(new File (path+"\\index.html"));
        bw = new BufferedWriter(writer);
        
        String HEAD = "<html>"
                + "<head> "
                + "<style>"
                + "table, th, td {border: 1px solid black; padding: 0px;}\n"
                + "table {border-spacing: 1px;}"
                + "</style>"
                + "</head><body> <h2> Index </h2> <br/>";
        
        String BODY = "</body></html>";
        bw.write(HEAD);
        
        String subTopic = "<h3>Groups</h3> <br/>";
        bw.write(subTopic);
        
        for(GroupNo group : _groupList.values()){
            createGroupWiseIndex(group.getgNo());
        }
        
        subTopic = "<br/> <h3>Lectures</h3> <br/>";
        bw.write(subTopic);
        
        for(Lecturer lecturer : _lecturesList.values()){
            createLectureWiseIndex(lecturer.getLec_id());
        }
        
        subTopic = "<br/> <h3>Rooms</h3> <br/>";
        bw.write(subTopic);
        
        for(room r : _roomList.values()){
            createRoomWiseIndex(r.getType());
        }
        bw.write(BODY);
        bw.close();
        writer.close();
    }
    
    public void createGroupWiseIndex(String groupID) throws IOException{
        String html = groupID+".html";
        String link = "'"+html+"'";
        
        String index = "<a href="+link+">"+groupID+"</a> <br/>";
        
        bw.write(index);
    }
    
    public void createLectureWiseIndex(String lectureID) throws IOException{
        String html = lectureID+".html";
        String link = "'"+html+"'";
        
        String index = "<a href="+link+">"+lectureID+"</a> <br/>";
        
        bw.write(index);
    }
    
    public void createRoomWiseIndex(String room) throws IOException{
        String html = room+".html";
        String link = "'"+html+"'";
        
        String index = "<a href="+link+">"+room+"</a> <br/>";
        
        bw.write(index);
    }
}
