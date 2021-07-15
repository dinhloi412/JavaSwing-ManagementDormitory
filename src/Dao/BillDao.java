/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.BillModel;
import Model.RoomModel;
import Model.StudentModel;
import helper.DatabaseHelper;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import java.sql.CallableStatement;
/**
 *
 * @author LoiDinh
 */
public class BillDao {
      public boolean delete(int IDBill) throws Exception
    {
        
        String sql=" delete from Bill where IDBill= ?";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            // xoa sinh vien
            psmt.setInt(1, IDBill);
           
            return psmt.executeUpdate()>0; 
        }
        
    }
      // tang giá trị của bed mỗi khi insert
      public boolean updateCheckRoom(RoomModel rm) throws Exception
    {
        
        String sql="{call SP_Update_Points(?)}";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            CallableStatement  psmt=con.prepareCall(sql);
            )
            
        {
            
          
            psmt.setInt(1, rm.getIDRooms());
            
            
            return psmt.executeUpdate()>0; 
        }
        
    }
      
      public boolean update(BillModel bm) throws Exception
    {
        
        String sql="UPDATE dbo.Bill"+ 
                " SET IDStdudent = ?,IDRooms = ?,FullName = ?,Month = ? ,Price1= ?,Category = ?,Price2 = ?,TotalPrice=?,Status=? where IDBill= ? ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            //note:::id không được update chỗ này :<
            psmt.setInt(10, bm.getIDBill());
            psmt.setInt(1, bm.getIDStdudent());
            psmt.setInt(2, bm.getIDRooms());
            psmt.setString(3, bm.getFullName());
            psmt.setInt(4, bm.getMonth());
            psmt.setInt(5, bm.getPrice1());
            psmt.setString(6, bm.getCategory());
            psmt.setInt(7, bm.getPrice2());
            psmt.setInt(8,bm.getTotalPrice());
            // format ngày tháng sử dụng JCacularChooser
//             SimpleDateFormat sdf= new SimpleDateFormat("MM-dd-yyyy");
//            String date=sdf.format(bm.getDate());
//            psmt.setString(10, date);
            psmt.setBoolean(9, bm.getStatus());
            return psmt.executeUpdate()>0; 
        }
        
    }
      public boolean insert(BillModel bm) throws Exception
    {
      
        String sql="INSERT INTO Bill (IDStdudent ,IDRooms,FullName,Month,Price1,Category,Price2,TotalPrice,Date,Status)"+ "values(?,?,?,?,?,?,?,?,?,?)";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            ){
            
            psmt.setInt(1, bm.getIDStdudent());
            psmt.setInt(2, bm.getIDRooms());
            psmt.setString(3, bm.getFullName());
            psmt.setInt(4, bm.getMonth());
            psmt.setInt(5, bm.getPrice1());
            psmt.setString(6, bm.getCategory());
            psmt.setInt(7, bm.getPrice2());
            psmt.setInt(8,bm.getTotalPrice());
            // format ngày tháng sử dụng JCacularChooser
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(bm.getDate());
            psmt.setString(9, date);
            //-----------------------------//
            psmt.setBoolean(10, bm.getStatus());
            return psmt.executeUpdate()>0; 
        }
        
    }
     public BillModel FindByIDBill(int IDBill) throws Exception
    {
        
        String sql=" select* from Bill where IDBill=? ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            //tim kiem sinh vien    
            psmt.setInt(1, IDBill);
           
            try(ResultSet rs=psmt.executeQuery();){
                if(rs.next())
                {
                    BillModel bm= new BillModel();
                    bm.setIDBill(rs.getInt("IDBill"));
                    bm.setIDStdudent(rs.getInt("IDStdudent"));
                    bm.setIDRooms(rs.getInt("IDRooms"));
                    bm.setFullName(rs.getString("FullName"));
                    bm.setIDRooms(rs.getInt("Month"));
                    bm.setPrice1(rs.getInt("Price1"));
                    bm.setCategory(rs.getString("Category"));
                    bm.setPrice2(rs.getInt("Price2"));      
                    bm.setTotalPrice(rs.getInt("TotalPrice"));
                    bm.setDate(rs.getDate("Date"));
                    
                    return bm;
                    
                }
            }
            return null;
        }
        
    }  
      public List<BillModel> FindByAll() throws Exception
    {
        
        String sql=" select* from Bill ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            //tim kiem sinh vien    
           
           
            try(ResultSet rs=psmt.executeQuery();){
                List<BillModel> list= new ArrayList<>();
                while(rs.next())
                {
                    BillModel bm= new BillModel();
                    bm.setIDBill(rs.getInt("IDBill"));
                    bm.setIDStdudent(rs.getInt("IDStdudent"));
                    bm.setIDRooms(rs.getInt("IDRooms"));
                    bm.setFullName(rs.getString("FullName"));
                    bm.setIDRooms(rs.getInt("Month"));
                    bm.setPrice1(rs.getInt("Price1"));
                    bm.setCategory(rs.getString("Category"));
                    bm.setPrice2(rs.getInt("Price2"));  
                    bm.setTotalPrice(rs.getInt("TotalPrice"));
                    bm.setDate(rs.getDate("Date"));
                    list.add(bm);  
                }
                return list;
            }
            
        }
        
    }  
  
    
     
}
