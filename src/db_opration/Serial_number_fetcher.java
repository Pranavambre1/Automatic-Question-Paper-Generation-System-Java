/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_opration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Serial_number_fetcher {

    public ArrayList getSr_no(Statement st) 
    {
        ArrayList sr_no = new ArrayList();
        try {
             
            
            
            String query="select * from question_set";
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next())
            {
                sr_no.add(rs.getString(1));
            }
            System.out.println("SR_NO_IS:"+sr_no);
            
        } catch (Exception ex) {
            System.out.println("Exception:" + ex);
        }
        return sr_no;

    }
}
