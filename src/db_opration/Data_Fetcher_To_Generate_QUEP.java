/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_opration;


import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author prana
 */
public class Data_Fetcher_To_Generate_QUEP 
{
    public String getTeacher_Name(Statement st,String username)
    {
        String teacher_name="";
        try
        {
            String query="select * from register_info where uname='"+username+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                teacher_name=rs.getString(1);
            }
            System.out.println("Teacher name::"+teacher_name);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is:"+ex);
        }
        return teacher_name;
    }
     public ArrayList getDepartment(Statement st,String teachername) {
        ArrayList dept = new ArrayList();
        try {
            String query = "select *from question_set where teacher_name='"+teachername+"'";
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
    public ArrayList getSemester(Statement st ,String teachername) {
        ArrayList sem = new ArrayList();
        try {
           String query = "select *from question_set where teacher_name='"+teachername+"'";
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
    public ArrayList getSubject(Statement st,String teachername) {
        ArrayList sub = new ArrayList();
        try {
           String query = "select *from question_set where teacher_name='"+teachername+"'";
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
    
}
