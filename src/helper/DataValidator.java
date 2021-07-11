/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author LoiDinh
 */
public class DataValidator {
    public static void ValidationEmpty(JTextField field, StringBuilder sb , String errorMessage)
    {
        if(field.getText().equals(""))
        {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else
        {
            field.setBackground(Color.white);
        }
    }
    public static void ValidationEmpty(JPasswordField field, StringBuilder sb , String errorMessage)
    {
        String Password=new String(field.getPassword());
        if(field.getPassword().equals(""))
        {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else
        {
            field.setBackground(Color.white);
        }
    }
}
