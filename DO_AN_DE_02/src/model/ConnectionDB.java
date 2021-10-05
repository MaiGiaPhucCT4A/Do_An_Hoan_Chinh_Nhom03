/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LaptopDT
 */
public class ConnectionDB {// BẢN NHÁP

    public static void main(String[] args) {
        var server = "DESKTOP-MTNPNPL\\SQLEXPRESS";
        var user = "sa";
        var password = "123456";
        var db = "QLSV_JAVA";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try (Connection conn = ds.getConnection()) {
            System.out.println("Ket noi thanh cong");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            //Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            // or
            ex.printStackTrace();
        }
    }
}
