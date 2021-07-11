/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.AccountModel;
import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import view.Student;
/**
 *
 * @author LoiDinh
 */
public class AccountDao {
    public AccountModel checkLogin(String UserName, String Password) throws Exception
    {
        String sql="select UserName, Password , Role from Account where UserName=? and Password=?";
    
        try(
            Connection con= DatabaseHelper.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);

            )
        {
            psmt.setString(1, UserName);
            psmt.setString(2, Password);
            try(
                   ResultSet rs=psmt.executeQuery();
                )
            {
                if(rs.next())
                {
                    AccountModel nd= new AccountModel();
                    nd.setUserName(UserName);
//                    nd.setPassword(Password);
                    nd.setRole(rs.getString("Role"));
                    return nd;
                }
            }
        }
        return null;
    }
}
