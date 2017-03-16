package lostitemproject;

import java.util.ArrayList;
import java.util.Date;

public class LostItem {

    private int itemId;
    private String itemName;
    private String itemDescription;
    private int itemType;
    //private ItemStatus[] itemStatus;
    private int ownerId;
    //private Picture[] itemPicture;
    private int pictureCount = 0;

    public LostItem(int itemId, String itemName, String itemDescription, int itemType, int ownerId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.ownerId = ownerId;
    }

    public LostItem() {
    }
    
    public static void addNewLostItem(String itemName, String itemDescription, int itemType,int reporterId) {
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
    
/*
    public ArrayList<LostItem> getAllLostItem() {
        ArrayList<LostItem> allLostItem = new ArrayList<LostItem>();
        //get db
        //mapping 
        allLostItem.add(new LostItem(0,"iphone4", "broken", 1,002));
        allLostItem.add(new LostItem(1,"samsung", "can explode", 1,003));
        allLostItem.add(new LostItem(2,"wallet", "have no money inside", 3,001));
        allLostItem.add(new LostItem(3,"key", "blue color", 4,005));
        
        return allLostItem;
    }
    
    public ArrayList<LostItem> getAllLostItemByLocate(int location) {
        ArrayList<LostItem> lostItemLocateFilter = new ArrayList<LostItem>();
        //get db
        //mapping 
        LostItem l1 = new LostItem(0,"iphone4", "broken", 1,002);
        LostItem l2 = new LostItem(1,"samsung", "can explode", 1,003);
        LostItem l3 = new LostItem(2,"wallet", "have no money inside", 3,001);
        LostItem l4 = new LostItem(3,"key", "blue color", 4,005);
        LostItem[] allItemList = {l1,l2,l3,l4};
        ArrayList<ItemStatus> allStatusList = ItemStatus.getAllItemStatus();
//        ItemStatus[] allStatusList = {new ItemStatus(0, 0, 1, new Date(),0),
//                                    new ItemStatus(1, 1, 1, new Date(),0),
//                                    new ItemStatus(2, 1, 2, new Date(),1),
//                                    new ItemStatus(3, 0, 3, new Date(),2)};
        
        for(int i=0;i<allStatusList.size();i++){
            if(allStatusList.get(i).getStatusId()==0){
                if(allStatusList.get(i).getLocation()==location){
                    for(int j=0;j<allItemList.length;j++){
                        if(allStatusList.get(i).getItemId()==allItemList[j].getItemId()){
                            lostItemLocateFilter.add(allItemList[j]);
                        }
                    }       
                }
            }else{
                //เอาตัวที่หาเจอแล้ว(status==1)ออกจาก list
            }
        }

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
*/
}
