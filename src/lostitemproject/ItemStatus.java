/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostitemproject;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class ItemStatus {
    private int statusId;
    private boolean statusFound;
    private int locationId;
    private int locationName;
    private Date statusDate;
    private int itemId;

    public ItemStatus() {
    }

    
    public ItemStatus(int statusId, boolean statusFound, int locationId, Date statusDate, int itemId) {
        this.statusId = statusId;
        this.statusFound = statusFound;
        this.locationId = locationId;
        this.statusDate = statusDate;
        this.itemId = itemId;
    }
    
    
    public boolean getStatusFound() {
        return statusFound;
    }

    public void setStatusFound(boolean status) {
        this.statusFound = status;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
     

    public static void addStatus(int location,int itemId,int accountId,int status)
                throws SQLException,ClassNotFoundException{        
        Connection conn=null; 
        Statement stm=null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String statusDate = sdf.format(new Date());
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaname_db","root","");
        stm = conn.createStatement();
        stm.execute("insert into itemstatus (itemStatusDate,Location_locationId,Item_itemId,Accout_userID,Status_statusID)"
                + "value ('"+statusDate+"',"+location+","+itemId+","+accountId+","+status+")");
        if(conn!=null)
            conn.close();
    }
    public static ItemStatus getItemStatus(){
        ItemStatus stat = new ItemStatus();
        
        return stat;
    }

    @Override
    public String toString() {
        return "statusId = " + statusId + "\nstatusFound = " + statusFound +
                "\nlocationId = " + locationId + "\nstatusDate = " + statusDate + "\nitemId = " + itemId+"\n";
    }
        
    
}
