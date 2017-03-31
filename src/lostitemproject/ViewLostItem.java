/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostitemproject;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author POOM
 */
public class ViewLostItem {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int input,accountId=2;
        try {
            String condition = "";
            System.out.println("1 - View my item\n2 - View all item");
            System.out.print("Choose (number) : ");
            input=sc.nextInt();
            if(input==1){
                condition="AND item.Accout_userID="+accountId;
            }else{
                System.out.println("===category list===\n0 - All Category\n1 - device\n2 - costume\n3 - Bag\n4 - Key\n5 - Other");
                System.out.print("Enter Item category (number) : ");
                input = sc.nextInt();              
                if(input!=0){
                    condition="AND Cate_cateId="+input;
                }

                System.out.println("===location list===\n0.All Location\n1.SIT Building\n2.KFC\n3.CB1\n4.CB2");
                System.out.print("Enter location (number) : ");
                input = sc.nextInt();
                if(input!=0){        
                    condition+=" AND Location_locationId="+input;                   
                }
            }
            System.out.print("===Order By===\n1 - Newest First.\n2 - Oldest first.\nChoose (number) : ");
            String orderBy=(sc.nextInt()==1?"DESC":"ASC");
            LostItem item[] = LostItem.getAllLostItem(condition,orderBy);
            for(int i=0;i<item.length;i++){
                System.out.println((i+1)+"."+item[i]);
            }
            System.out.print("Inspect Item (select number) : ");
            int focusItem = sc.nextInt();
            ItemStatus stat = ItemStatus.getItemStatus(item[focusItem-1].getItemId());
            System.out.println(stat);    
            System.out.println("1 - change status\n2 - back");
            System.out.print("Choose (number) : ");
            input = sc.nextInt();
            while(input==1){                                                
                if(item[focusItem-1].getOwnerId()==accountId){
                    System.out.println("1 - Lost\n2 - Found\n3 - Received");
                    System.out.print("Choose (number) : ");
                    ItemStatus.addStatus(stat.getLocationId(), stat.getItemId(), accountId,sc.nextInt());                   
                    System.out.println("Change Status Completed.");
                    stat = ItemStatus.getItemStatus(item[focusItem-1].getItemId());
                    System.out.println(stat);                                
                }else{
                    System.out.println("You don't have permission to change status this item.");
                }
                System.out.println("1 - change status\n2 - back");
                System.out.print("Choose (number) : ");
                input = sc.nextInt();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid Input -> Data not found.");
        }
    }
}
