/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_opration;

import java.sql.*;
import java.util.*;

/**
 *
 * @author prana
 */
public class Question_Fetcher 
{
    public ArrayList get_Question(Statement st,String department,String semester,String subject)
    {
        ArrayList que_data=new ArrayList();
        try
        {
            String query="select * from question_set where department='"+department+"' and semester='"+semester+"' and subject='"+subject+"'";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                ArrayList row=new ArrayList();
                row.add(rs.getString(6));
                row.add(rs.getString(7));
                row.add(rs.getString(8));
                que_data.add(row);
            }
            System.out.println("Question Data Is:"+que_data);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is:"+ex);
        }
        return que_data;
    }
    
}
