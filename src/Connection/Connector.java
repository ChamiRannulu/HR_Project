/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Connector {

    private static Connection con;
    ResultSet rs;

    public Connection getConnection() throws Exception {
        if (con == null) {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salary_management_system", "root", "1234");
        }
        return con;
    }

    public int aud(String sql) throws Exception {
        getConnection();
        Statement st = con.createStatement();
        int i = st.executeUpdate(sql);
        return i;
    }

    public int audr(String sql) throws Exception {
        getConnection();
        Statement st = con.createStatement();
        int i = st.executeUpdate(sql);
        ResultSet rs = st.executeQuery("SELECT LAST_INSERT_ID()");
        while (rs.next()) {
            i = rs.getInt("LAST_INSERT_ID()");
        }
        return i;
    }

    public ResultSet srh(String sql) throws Exception {
        getConnection();
        Statement st = con.createStatement();
        rs = st.executeQuery(sql);
        return rs;
    }

    public int checkavailable(String sql, String column) throws Exception {
        int i = 0;
        rs = srh(sql);
        while (rs.next()) {
            String s = rs.getString(column);
            if (s.equals(null)) {
                i = 0;
            } else {
                i = 1;
            }
        }
        return i;
    }

    public int nextnum(String sql, String column) throws Exception {
        int id = 0;
        rs = srh(sql);
        while (rs.next()) {
            id = rs.getInt(column) + 1;
        }
        return id;
    }
}
