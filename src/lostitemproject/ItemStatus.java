/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostitemproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class ItemStatus {
    private int statusId;
    private boolean statusFound;
    private int location;
    private Date statusDate;
    private int itemId;

    public ItemStatus(int statusId, boolean statusFound, int location, Date statusDate, int itemId) {
        this.statusId = statusId;
        this.statusFound = statusFound;
        this.location = location;
        this.statusDate = statusDate;
        this.itemId = itemId;
    }
    
    
    public boolean getStatusFound() {
        return statusFound;
    }

    public void setStatusFound(boolean status) {
        this.statusFound = status;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
     
    /*
    public void changeStatus(){
        this.statusFound = true;
    }
    */
    
    public static boolean changeStatus(int itemId,boolean statusFound){
        
        
        return true;
    }
    public static boolean addStatus(int location,int itemId,Date statusDate){
        
        
        return true;
    }
    public static ArrayList<ItemStatus> getAllItemStatus(){
        ArrayList<ItemStatus> allStatusList = new ArrayList<ItemStatus>();
        allStatusList.add(new ItemStatus(0, false, 1, new Date(),0)); 
        allStatusList.add(new ItemStatus(1, true, 1, new Date(),1));
        allStatusList.add(new ItemStatus(2, true, 2, new Date(),2));
        allStatusList.add(new ItemStatus(3, false, 3, new Date(),3));
        
        return allStatusList;
    }

    @Override
    public String toString() {
        return "statusId = " + statusId + "\nstatusFound = " + statusFound +
                "\nlocation = " + location + "\nstatusDate = " + statusDate + "\nitemId = " + itemId+"\n";
    }
        
    
}
