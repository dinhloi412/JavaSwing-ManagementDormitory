/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.RoomModel;
import Model.StudentModel;
import helper.DatabaseHelper;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.rowset.serial.SerialBlob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LoiDinh
 */
public class RoomsDao {
      public boolean insert(RoomModel rm) throws Exception
    {
      
        String sql="INSERT INTO [dbo].[Rooms] ([IDrooms],[RoomName] ,[Bed],[LimitedBed]) values(?,?,?,?)";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            ){
            psmt.setInt(1, rm.getIDRooms());
            psmt.setString(2, rm.getRoomName());
            psmt.setInt(3, rm.getBed());
            psmt.setInt(4, rm.getLimitedBed());
            return psmt.executeUpdate()>0; 
        }
        
    }
    public boolean delete(String IDrooms) throws Exception
    {
      
        String sql="delete from Rooms where IDrooms=? ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            ){
            
            psmt.setString(1,IDrooms);
            return psmt.executeUpdate()>0; 
        }
        
    }
    public RoomModel FindByIDRooms(int IDrooms) throws Exception
    {
      
        String sql="select* from Rooms where IDrooms=? ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            ){
                
            psmt.setInt(1,IDrooms);
            try(ResultSet rs=psmt.executeQuery();)
            {
                if(rs.next())
                {
                    RoomModel rm= new RoomModel();
                    rm.setIDRooms(rs.getInt("IDrooms"));
                    rm.setRoomName(rs.getString("RoomName"));
                    rm.setBed(rs.getInt("Bed"));
                    rm.setLimitedBed(rs.getInt("LimitedBed"));
                    
                    return rm;
                }
            }
            return null;
        }
        
    }
     public List<RoomModel> FindAll() throws Exception
    {
      
        String sql="select* from Rooms ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            ){
                
            
            try(ResultSet rs=psmt.executeQuery();){
                List<RoomModel> list= new ArrayList<>();
            
                while(rs.next())
                {
                    RoomModel rm= new RoomModel();
                    rm.setIDRooms(rs.getInt("IDrooms"));
                    rm.setRoomName(rs.getString("RoomName"));
                    rm.setBed(rs.getInt("Bed"));
                    rm.setLimitedBed(rs.getInt("LimitedBed"));
                    
                    list.add(rm);
                }
                return list;
            }
            
        }
    }
//    private Connection con;
//    public ArrayList<RoomModel> getban(int idroom) throws Exception
//    {
//      
//       ArrayList<RoomModel> arrRoom = null;
//        String sql;
//        if(idroom == 0)
//            sql = "Select * From Room";
//        else
//            sql = "Select * From Room Where RoomName = '"+idroom+"'";
//        try{
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            arrRoom = new ArrayList<RoomModel>();
//            while(rs.next()){
//                RoomModel sp = new RoomModel(rs.getString(1), rs.getInt(2), rs.getInt(3));
//                arrRoom.add(sp);
//            }
//        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi !");
//        }
//        return arrRoom; 
//    } 
    
}
