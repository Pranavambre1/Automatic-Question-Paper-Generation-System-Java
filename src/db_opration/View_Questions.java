
package db_opration;

import admin.View_Questions_Frame;
import java.sql.ResultSet;
import java.sql.Statement;


public class View_Questions {
    public void getView_Question(String dept,String sem,String sub,String teachername)
    {
        try
        {
            Statement st1=new DB_Driver().getStatement();
            Statement st2=new DB_Driver().getStatement();
            String query="select * from question_set where department='"+dept+"' and semester='"+sem+"' and subject='"+sub+"' and teacher_name='"+teachername+"'";  
            ResultSet rs1=st1.executeQuery(query);
            ResultSet rs2=st2.executeQuery(query);
            int row=0;
            while(rs1.next())
            {
                row++;
            }
            String data[][]= new String[row][4];
            int i=0;
            while(rs2.next())
            {
                String unit=rs2.getString(5);
                String question=rs2.getString(6);
                String level=rs2.getString(7);
                String marks=rs2.getString(8);
                
                data[i][0]=unit;
                data[i][1]=question;
                data[i][2]=level;
                data[i][3]=marks;
                i++;
                
            }
            View_Questions_Frame.que_data=data;
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception is="+ex);
        }
    }
}
