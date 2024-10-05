
package db_opration;

import java.sql.*;

public class Registration {

    public boolean isRegister(String name, String mobile, String email, String register, String uname, String password) {
        boolean flag = false;
        try {
            
            Statement st = new DB_Driver().getStatement();
            String query = "insert into register_info values('" + name + "','" + mobile + "','" + email + "','" + register + "','" + uname + "','" + password + "')";
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
