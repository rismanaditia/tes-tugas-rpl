/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_input;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tes.koneksi;
/**
 *
 * @author ACER
 */
public class input_data {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null ;
    
    private String sql;
    public String No;
    public String NIK;
    public String Nama;
    public String Alamat;
    

    public void simpan() throws SQLException{
        koneksi classKoneksi = new koneksi();
        con = classKoneksi.getConnection();
        sql = "INSERT INTO `tabel odp`(No,NIK,Nama,Alamat)VALUE(?,?,?,?)";
        pst = con.prepareStatement(sql);
        pst.setString(1, No);
        pst.setString(2, NIK);
        pst.setString(3, Nama);
        pst.setString(4, Alamat);
        pst.execute();
        pst.close();
    }
}
