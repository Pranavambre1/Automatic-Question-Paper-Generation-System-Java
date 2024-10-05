package db_opration;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Questions_Data_Fetcher {

    public ArrayList getDepartment(Statement st) {
        ArrayList dept = new ArrayList();
        try {
            String query = "select *from question_set";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                dept.add(rs.getString(2));

            }
            System.out.println("Department list is=" + dept);

        } catch (Exception ex) {
            System.out.println("Exception=" + ex);
        }
        return dept;
    }
    public ArrayList getSemester(Statement st) {
        ArrayList sem = new ArrayList();
        try {
            String query = "select *from question_set";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                sem.add(rs.getString(3));

            }
            System.out.println("Semester list is=" + sem);

        } catch (Exception ex) {
            System.out.println("Exception=" + ex);
        }
        return sem;
    }
    public ArrayList getSubject(Statement st) {
        ArrayList sub = new ArrayList();
        try {
            String query = "select *from question_set";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                sub.add(rs.getString(4));

            }
            System.out.println("Subject list is=" + sub);

        } catch (Exception ex) {
            System.out.println("Exception=" + ex);
        }
        return sub;
    }
     public ArrayList getTeacher_Name(Statement st) {
        ArrayList teacher_name = new ArrayList();
        try {
            String query = "select *from question_set";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                teacher_name.add(rs.getString(9));

            }
            System.out.println("Teacher Name list is=" + teacher_name);

        } catch (Exception ex) {
            System.out.println("Exception=" + ex);
        }
        return teacher_name;
    }
}
