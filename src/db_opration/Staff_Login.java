
package db_opration;

import java.sql.*;

public class Staff_Login {

    public boolean isLogin(String uname, String password,String you) {
        boolean flag = false;
        try {
            Statement st = new DB_Driver().getStatement();
            String query = "select * from register_info where uname='" + uname + "' and password='" + password + "' and register='"+you+"'";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                flag = true;
            } else {
                flag = false;
            }

        } catch (Exception ex) {
            System.out.println("Exception:" + ex);
        }
        return flag;
    }
}
