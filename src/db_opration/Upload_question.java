package db_opration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Upload_question {

    public boolean isquestion_Uploaded(Statement st,String sr_no, String dept, String sem, String sub, String unit, String que, String level, String marks, String teacher_name) {
        boolean flag = false;
        try {
            
            String query = "insert into question_set values('" + sr_no + "','" + dept + "','" + sem + "','" + sub + "','" + unit + "','" + que + "','" + level + "','" + marks + "','" + teacher_name + "')";
            int x = st.executeUpdate(query);
            if (x > 0) {
                flag = true;
            } else {
                flag = false;
              
            }

        } catch (Exception ex) {
            System.out.println("Exception::" + ex);
        }
        return flag;
    }
}
