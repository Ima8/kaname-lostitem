package lostitemproject;

import java.util.ArrayList;
import java.util.Date;

public class LostItem {

    private int itemId;
    private String itemName;
    private String itemDescription;
    private int itemType;
    private int ownerId;

    public LostItem() {
    }
    public LostItem(int itemId, String itemName, String itemDescription, int itemType, int ownerId){ 
        this.itemId = itemId; 
        this.itemName = itemName; 
        this.itemDescription = itemDescription; 
        this.itemType = itemType; 
        this.ownerId = ownerId;
    } 

    public static void addNewLostItem(String itemName, String itemDescription, int itemType,int ownerId,int location) { 
        //ส่งข้อมูลเข้า db 
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
 
    public int getOwnerId() { 
        return ownerId; 
    } 

        
            
          
 
    public static ArrayList<LostItem> getAllLostItem() { 
        ArrayList<LostItem> allLostItem = new ArrayList<LostItem>(); 
        //get db 
        //mapping  
        allLostItem.add(new LostItem(0,"iphone4", "broken", 1,002)); 
        allLostItem.add(new LostItem(1,"samsung", "can explode", 1,003)); 
        allLostItem.add(new LostItem(2,"wallet", "have no money inside", 3,001)); 
        allLostItem.add(new LostItem(3,"key", "blue color", 4,005)); 
         
        return allLostItem;
    } 
     
    public static ArrayList<LostItem> getAllLostItemByLocate(int location) { 
        ArrayList<LostItem> lostItemFilterLocate = new ArrayList<LostItem>(); 
        //get db 
        //mapping
        ArrayList<LostItem> allItemList = getAllLostItem();
        ArrayList<ItemStatus> allStatusList = ItemStatus.getAllItemStatus();     
        for(int i=0;i<allStatusList.size();i++){ 
            if(allStatusList.get(i).getLocation()==location){
                lostItemFilterLocate.add(allItemList.get(i));
            }
        }
        return lostItemFilterLocate; 
    } 
     
    public static ArrayList<LostItem> getAllLostItemWithLimit(int limit) { 
        //int limit = endIndex - startIndex + 1; 
        ArrayList<LostItem> lostItemWithLimit = new ArrayList<LostItem>();
        ArrayList<LostItem> allItem = getAllLostItem();
        for (int i = 0; i < limit; i++) { 
            lostItemWithLimit.add(allItem.get(i));
            if(i>=allItem.size()-1){
                break;
            }
        } 
        return lostItemWithLimit; 
    } 
 
    public static ArrayList<LostItem> getAllLostItemByUser(int accId) { 
        ArrayList<LostItem> allItem = getAllLostItem();
        ArrayList<LostItem> lostItemFilterUser = new ArrayList<LostItem>(); 
        for(int i=0;i<allItem.size();i++){ 
            if(allItem.get(i).getOwnerId()==accId){
                lostItemFilterUser.add(allItem.get(i));
            }
        }
        return lostItemFilterUser; 
    } 

    @Override
    public String toString() {
        return "itemId = " + itemId + "\nitemName = " + itemName + "\nitemDescription = " + itemDescription +
                "\nitemType=" + itemType + "\nownerId=" + ownerId +"\n";
    }
    
 
} 

