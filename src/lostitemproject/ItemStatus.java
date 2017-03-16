package lostitemproject;

import java.util.Date;

public class ItemStatus {
    private int statusId;
    private int status;
    private int location;
    private Date statusDate;
    private int itemId;

    public ItemStatus(int statusId, int status, int location, Date statusDate,int itemId) {
        this.statusId = statusId;
        this.status = status;
        this.location = location;
        this.statusDate = statusDate;
        this.itemId = itemId;
    }



    
    public boolean addNewStatus(int itemId,int statusId,Date statusDate,int location){
        //statusId >> 1=หาอยู่ 2=เจอแล้ว
        //location >> 1=CBKMUTT 2=.....
        // db  
        return false;
    }
    public int getStatusId(int ItemId) {
        // db  
        return statusId;
    }
    //getLocation(ItemId)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    
    public Date getStatusDate() {
        return statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
    
}
