/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author LoiDinh
 */
public class StudentModel implements Serializable {
    private int IDStdudent;
    private String FullName;
    private String Email;
    private String  PhoneNumber;
    private int  Sex;
    private String  Address;
    private String  Birthday;
    private byte[] picture;

    public StudentModel() {
    }

    public StudentModel(int IDStdudent, String FullName, String Email, String PhoneNumber, int Sex, String Address, String Birthday, byte[] picture) {
        this.IDStdudent = IDStdudent;
        this.FullName = FullName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Sex = Sex;
        this.Address = Address;
        this.Birthday = Birthday;
        this.picture = picture;
    }

    public int getIDStdudent() {
        return IDStdudent;
    }

    public void setIDStdudent(int IDStdudent) {
        this.IDStdudent = IDStdudent;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int Sex) {
        this.Sex = Sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    
    
}
