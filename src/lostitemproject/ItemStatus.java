package lostitemproject;

import java.util.Date;

public class ItemStatus {
    private int statusId;
    private String statusName;
    private double latitude;
    private double longitude;
    private Date statusDate;

    
    public boolean addNewStatus(int itemId,int statusId){
        
        // db 
        
        
        return false;
    }
    public int getStatusId() {
        return statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    
    public Date getStatusDate() {
        return statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
      
}
