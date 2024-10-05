
package db_opration;

import java.sql.*;

import java.util.*;

public class Staff_Data_Fetcher {

    public ArrayList getdata(String uname) {
        ArrayList data = new ArrayList();
        try {
            Statement st = new DB_Driver().getStatement();
            String query = "select * from register_info where uname='" + uname + "'";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                data.add(rs.getString(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getString(4));
                data.add(rs.getString(5));
                data.add(rs.getString(6));
            }
            System.out.println("Data is:" + data);
        } catch (Exception ex) {
            System.out.println("Exception :" + ex);
        }
        return data;
    }
}
