
package db_opration;

import java.sql.*;
public class Admin_Edit_Profile {
    public boolean isUpdated(String name,String mobile,String email,String register,String uname,String password)
    {
        boolean flag=false;
        try{
               Statement st = new DB_Driver().getStatement();
            String query="update register_info set name='"+name+"',mobile='"+mobile+"',email='"+email+"',register='"+register+"',password='"+password+"' where uname='"+uname+"'";
            int x=st.executeUpdate(query);
            if(x>0)
            {
                flag=true;
            }
            else
            {
                flag=false;
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception:"+ex);
        }
        return flag;
    }
}
