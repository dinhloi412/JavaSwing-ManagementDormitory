/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LoiDinh
 */
public class BillModel {
    private int IDBill;
    private int IDStdudent;
    private int IDRooms;
    private String FullName;
    private int Month;
    private int Price1;
    private String Category;
    private int Price2;
    private int TotalPrice;
    public BillModel() {
    }

    public BillModel(int IDBill, int IDStdudent, int IDRooms, String FullName, int Month, int Price1, String Category, int Price2,  int TotalPrice) {
        this.IDBill = IDBill;
        this.IDStdudent = IDStdudent;
        this.IDRooms = IDRooms;
        this.FullName = FullName;
        this.Month = Month;
        this.Price1 = Price1;
        this.Category = Category;
        this.Price2 = Price2;
        this.TotalPrice=TotalPrice;
    }

    public int getIDBill() {
        return IDBill;
    }

    public void setIDBill(int IDBill) {
        this.IDBill = IDBill;
    }

    public int getIDStdudent() {
        return IDStdudent;
    }

    public void setIDStdudent(int IDStdudent) {
        this.IDStdudent = IDStdudent;
    }

    public int getIDRooms() {
        return IDRooms;
    }

    public void setIDRooms(int IDRooms) {
        this.IDRooms = IDRooms;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getPrice1() {
        return Price1;
    }

    public void setPrice1(int Price1) {
        this.Price1 = Price1;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPrice2() {
        return Price2;
    }

    public void setPrice2(int Price2) {
        this.Price2 = Price2;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    
    
}
