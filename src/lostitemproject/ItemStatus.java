/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostitemproject;

import java.util.Date;

/**
 *
 * @author User
 */
public class ItemStatus {
    private int location;
    private Date statusDate;
    private boolean statusFound;
    private int itemId;
    
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
        
    
}
