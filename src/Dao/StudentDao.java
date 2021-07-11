/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.AccountModel;
import Model.StudentModel;
import helper.DatabaseHelper;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
/**
 *
 * @author LoiDinh
 */
public class StudentDao {
     public List<StudentModel> findall() throws Exception
    {
        
        String sql=" select* from Stdudent";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            //do csdl vao database
          
           
            try(ResultSet rs=psmt.executeQuery();){
                List<StudentModel> list= new ArrayList<>();
                while(rs.next())
                {
                    StudentModel sv= createStudent(rs);
                    list.add(sv);
                    
                    
                }
                return list;
            }
            
        }
        
    }

    private StudentModel createStudent(final ResultSet rs) throws SQLException {
        StudentModel sv= new StudentModel();
        sv.setIDStdudent(rs.getInt("IDStdudent"));
        sv.setFullName(rs.getString("FullName"));
        sv.setEmail(rs.getString("Email"));
        sv.setPhoneNumber(rs.getString("PhoneNumber"));
        sv.setAddress(rs.getString("Address"));
        sv.setSex(rs.getInt("Sex"));
        sv.setBirthday(rs.getString("Birthday"));
        Blob blod =rs.getBlob("picture");
        if(blod!=null)
        sv.setPicture(blod.getBytes(1, (int) blod.length()));
        return sv;
    }
      public StudentModel FindByID(int IDStudent) throws Exception
    {
        
        String sql=" select* from Stdudent where IDStdudent=? ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            //tim kiem sinh vien    
            psmt.setInt(1, IDStudent);
           
            try(ResultSet rs=psmt.executeQuery();){
                if(rs.next())
                {
                    StudentModel sv= createStudent(rs);
                    
                    return sv;
                    
                }
            }
            return null;
        }
        
    }
      public boolean insert(StudentModel sv) throws Exception
    {
     
        String sql="insert into dbo.Stdudent  (IDStdudent,FullName,Email,PhoneNumber,Sex,Address ,Birthday,Picture)" + "values(?,?,?,?,?,?,?,?)";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            psmt.setInt(1, sv.getIDStdudent());
            psmt.setString(2, sv.getFullName());
            psmt.setString(3, sv.getEmail());
            psmt.setString(4, sv.getPhoneNumber());
            psmt.setInt(5, sv.getSex());
            
//            psmt.setDate(6, new Date(sv.getBirthday().getTime()));
//            ps.setDate(3, new Date(s.getDob().getTime()));
            psmt.setString(7, sv.getAddress());
            psmt.setString(6, sv.getBirthday());
//            File input= null;
//            BufferedImage read= ImageIO.read(input);
            if(sv.getPicture()!=null)
            {
               Blob picture= new SerialBlob(sv.getPicture());
               psmt.setBlob(8,picture);
                       
            }else
            {
                Blob picture= null;
                psmt.setBlob(8, picture);
            }
            return psmt.executeUpdate()>0; 
        }
        
    }
      public boolean update(StudentModel sv) throws Exception
    {
        
        String sql="UPDATE dbo.Stdudent"+ 
                " SET FullName = ?,Email = ?,PhoneNumber = ?,Sex = ?,Address = ? ,Birthday= ?,Picture = ? where IDStdudent= ?";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            psmt.setInt(8, sv.getIDStdudent());
            psmt.setString(1, sv.getFullName());
            psmt.setString(2, sv.getEmail());
            psmt.setString(3, sv.getPhoneNumber());
            psmt.setInt(4, sv.getSex());
            
//            psmt.setDate(6, new Date(sv.getBirthday().getTime()));
//            ps.setDate(3, new Date(s.getDob().getTime()));
            psmt.setString(5, sv.getAddress());
            psmt.setString(6, sv.getBirthday());
//            File input= null;
//            BufferedImage read= ImageIO.read(input);
            if(sv.getPicture()!=null)
            {
               Blob picture= new SerialBlob(sv.getPicture());
               psmt.setBlob(7,picture);
                       
            }else
            {
                Blob picture= null;
                psmt.setBlob(7, picture);
            }
            return psmt.executeUpdate()>0; 
        }
        
    }
       public boolean delete(String IDStudent) throws Exception
    {
        
        String sql=" delete from Stdudent where IDStdudent= ?";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            // xoa sinh vien
            psmt.setString(1, IDStudent);
           
            return psmt.executeUpdate()>0; 
        }
        
    }
}
