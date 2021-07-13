/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.BillModel;
import Model.RoomModel;
import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LoiDinh
 */
public class RoomInfoDao {
    public BillModel FindByIDRooms(int IDrooms) throws Exception
    {
      
        String sql="select IDrooms from Bill where IDrooms=? ";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            ){
                
            psmt.setInt(1,IDrooms);
            try(ResultSet rs=psmt.executeQuery();)
            {
                if(rs.next())
                {
                    BillModel bm= new BillModel();
                    bm.setIDRooms(rs.getInt("IDrooms"));
                  
                    return bm;
                }
            }
            return null;
        }
        
    }
}
