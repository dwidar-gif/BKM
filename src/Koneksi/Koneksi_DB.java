package Koneksi;

import java.sql.*;

public class Koneksi_DB {
    private Connection kon;
    public Koneksi_DB() {
        try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        kon= DriverManager.getConnection("jdbc:mysql://localhost:3306/dkm","root","");
        System.out.println("Koneksi Sukses");
    
        }
        catch (Exception e) {
             System.out.println(e);
        }
    }
    
    public Connection getConnection() {
        return kon;
    }
}