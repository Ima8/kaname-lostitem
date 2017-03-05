/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostitemproject;

import java.util.Date;

/**
 *
 * @author POOM
 */
public class LostItem {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemType;
    private Status[] itemStatus;
    private String reporterName;
    private int reporterId;
    private static LostItem[] allLostItem=new LostItem[100];
    private static int itemCount = 0;
    private Picture[] itemPicture;
    private int pictureCount=0;

    public static void addNewLostItem(String itemName, String itemDescription, String itemType, String reporterName, int reporterId) {
        allLostItem[itemCount].itemName = itemName;
        allLostItem[itemCount].itemDescription = itemDescription;
        allLostItem[itemCount].itemType = itemType;
        allLostItem[itemCount].reporterName = reporterName;
        allLostItem[itemCount].reporterId = reporterId;
        allLostItem[itemCount].itemStatus = new Status[20];
        allLostItem[itemCount].itemPicture = new Picture[20];
        itemCount++;     
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public void setReporterId(int reporterId) {
        this.reporterId = reporterId;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public Status[] getAllStatus() {
        return itemStatus;
    }
    public Status getStatus(int index) {
        return itemStatus[index];
    }

    public String getReporterName() {
        return reporterName;
    }

    public int getReporterId() {
        return reporterId;
    }

    public LostItem[] getAllLostItem() {
        return allLostItem;
    }
    public LostItem[] getAllLostItemWithLimit(int startIndex,int endIndex) {
        int limit = endIndex-startIndex;
        LostItem[] lostItemWithLimit = new LostItem[limit];
        for(int i=0;i<limit;i++){
            lostItemWithLimit[i]=allLostItem[startIndex++];
        }
        return allLostItem;
    }
    public LostItem[] getAllLostItemByUser(int reporterId){
        LostItem[] lostItemList = new LostItem[20];
        int process=0;
        for(int i=0;i<20;i++){
            for(int j=process;j<allLostItem.length;j++){
                if(allLostItem[process].reporterId==reporterId){
                    lostItemList[i]=allLostItem[j];
                    process=j+1;
                    break;
                }
                if(j==allLostItem.length-1){
                    i=20;
                    break;
                }
            }
        }
        return lostItemList;
    }
    public Picture[] getAllPicture() {
        return itemPicture;
    }
    public Picture getPicture(int index) {
        return itemPicture[index];
    }
    
    public void changeStatus(String staName,Date staDate,int latitude,int longtitude){
        
    }
    public void addItemPicture(String path){
        itemPicture[pictureCount]=new Picture(path);
    }
    
    @Override
    public String toString() {
        return "LostItem{" + "itemId=" + itemId + ", itemName=" + itemName + ", itemDescription=" + itemDescription + ", itemType=" + itemType + ", itemStatus=" + itemStatus + ", reporterName=" + reporterName + ", reporterId=" + reporterId + ", allLostItem=" + allLostItem + ", itemPicture=" + itemPicture + '}';
    }
    
    
    
    
}
