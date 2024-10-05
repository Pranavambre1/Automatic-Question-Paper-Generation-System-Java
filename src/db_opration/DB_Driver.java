
package db_opration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author prana
 */
public class DB_Driver {

    public Statement getStatement() {
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/automatic_que_paper_generation_sysatem", "root", "root");
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println("Exception is:" + ex);
        }
        return st;
    }
}
