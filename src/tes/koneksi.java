/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class koneksi {
    Connection con;
   public Connection getConnection(){
try{
    con = DriverManager.getConnection("jdbc:mysql://localhost/tes","root","");
    JOptionPane.showMessageDialog(null, "Press OK to Continue");
}
catch(SQLException e){
    JOptionPane.showMessageDialog(null, "Failed to Load");
}
return con;
}static Object getKoneksi(){
    throw new UnsupportedOperationException("Not Yet Implemented");
}
}
   
