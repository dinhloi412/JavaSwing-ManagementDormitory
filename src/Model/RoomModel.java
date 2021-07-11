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
public class RoomModel {
    private int IDRooms;
    private String RoomName;
    private int Bed;
    private int LimitedBed;

    public RoomModel() {
    }
    
    public RoomModel(int IDRooms, String RoomName, int Bed, int Limited) {
        this.IDRooms = IDRooms;
        this.RoomName = RoomName;
        this.Bed = Bed;
        this.LimitedBed=LimitedBed;
    }

    public RoomModel(String string, int aInt, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIDRooms() {
        return IDRooms;
    }

    public void setIDRooms(int IDRooms) {
        this.IDRooms = IDRooms;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    public int getBed() {
        return Bed;
    }

    public void setBed(int Bed) {
        this.Bed = Bed;
    }

    public int getLimitedBed() {
        return LimitedBed;
    }

    public void setLimitedBed(int LimitedBed) {
        this.LimitedBed = LimitedBed;
    }
    
    
}
