package lostitemproject;

import java.util.Date;

public class ItemStatus {
    private int statusId;
    private int statusName;
    private int location;
    private Date statusDate;
    

    
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
    public int getStatusName() {
        return statusName;
    }

    public void setStatusName(int statusName) {
        this.statusName = statusName;
    }

    
    public Date getStatusDate() {
        return statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
      
}
