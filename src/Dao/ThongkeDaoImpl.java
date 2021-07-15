/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.sql.PreparedStatement;
import Bean.Phantich;
import helper.DatabaseHelper;
import java.util.List;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author LoiDinh
 */
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ThongkeDaoImpl implements ThongkeDao{

    @Override
    public List<Phantich> getlistBy() {
        try {
            Connection  con =  DatabaseHelper.openConnection();
            String sql=" select Date, count(*) as soluongdangky from Bill group by Date ";
            List<Phantich> list=new  ArrayList<>();
            PreparedStatement ps= (PreparedStatement) con.prepareCall(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next())
            {
                Phantich phantich= new Phantich();
                phantich.setNgaydangky(rs.getString("Date"));
                phantich.setSoluongdangky(rs.getInt("soluongdangky"));
                list.add(phantich);
            }
            ps.close();
            con.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ThongkeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;    
    }
    
    
}
