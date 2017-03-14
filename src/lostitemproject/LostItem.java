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
 * @author POOM
 */
public class LostItem {

    private int itemId;
    private String itemName;
    private String itemDescription;
    private int itemType;
    private ItemStatus[] itemStatus;
    private int ownerId;
    private Picture[] itemPicture;
    private int pictureCount = 0;

    public static void addNewLostItem(String itemName, String itemDescription, int itemType,int reporterId) {
        
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public void setOwnerId(int reporterId) {
        this.ownerId = reporterId;
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

    public int getItemType() {
        return itemType;
    }

    /*public ItemStatus[] getAllStatus() {
        return itemStatus;
    }

    public ItemStatus getStatus(int index) {
        return itemStatus[index];
    }
    */
    

    public int getOwnerId() {
        return ownerId;
    }

    public ArrayList<LostItem> getAllLostItem() {
        ArrayList<LostItem> allLostItem = new ArrayList<LostItem>();
        //get db
        //mapping 
        LostItem l1 = new LostItem();
        LostItem l2 = new LostItem();
        LostItem l3 = new LostItem();
        LostItem l4 = new LostItem();

        l1.setItemName("gg");
        for(){
            
        }

        allLostItem.add(l1);
        
        

        //return allLostItem
        return allLostItem;
    }
    
    public ArrayList<LostItem> getAllLostItemByLocate(int location) {
        ArrayList<LostItem> allLostItem = new ArrayList<LostItem>();
        //get db
        //mapping 
        LostItem l1 = new LostItem();
        LostItem l2 = new LostItem();
        LostItem l3 = new LostItem();
        LostItem l4 = new LostItem();
        
        
        l1.setItemName("gg");
        for(){
            
        }
        int thislocate = ItemStatus.getLocation(11.getItemId());
        if(thislocate==location)
            allLostItem.add(l1);
        
        

        //return allLostItem
        return allLostItem;
    }
    
    public LostItem[] getAllLostItemWithLimit(int startIndex, int endIndex) {
        int limit = endIndex - startIndex;
        LostItem[] lostItemWithLimit = new LostItem[limit];
        for (int i = 0; i < limit; i++) {
            lostItemWithLimit[i] = allLostItem[startIndex++];
        }
        return allLostItem;
    }

    public LostItem[] getAllLostItemByUser(int reporterId) {
        LostItem[] lostItemList = new LostItem[20];
        ArrayList al = new ArrayList();
        int process = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = process; j < allLostItem.length; j++) {
                if (allLostItem[process].reporterId == reporterId) {
                    lostItemList[i] = allLostItem[j];
                    process = j + 1;
                    al.add(j);
                    break;
                }
                if (j == allLostItem.length - 1) {
                    i = 20;
                    break;
                }
            }
        }
        return al;
    }
    
    

    public Picture[] getAllPicture() {
        return itemPicture;
    }

    public Picture getPicture(int index) {
        return itemPicture[index];
    }


    @Override
    public String toString() {
        return "LostItem{" + "itemId=" + itemId + ", itemName=" + itemName
                + ", itemDescription=" + itemDescription + ", itemType=" + itemType + ", itemStatus="
                + itemStatus + ", reporterName=" + reporterName + ", reporterId="
                + reporterId + ", allLostItem=" + allLostItem + ", itemPicture=" + itemPicture + '}';
    }

}
