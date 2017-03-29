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
        int input;
        try {
            String condition = "";
            System.out.println("1 - View my item\n2 - View all item");
            System.out.print("choose (number) : ");
            input=sc.nextInt();
            if(input==1){
                
            }else{
                System.out.println("===category list===\n0 - All Category\n1 - device\n2 - costume\n3 - Bag\n4 - Key\n5 - Other");
                System.out.print("Enter Item category (number) : ");
                input = sc.nextInt();              
                if(input!=0){
                    condition="Where Cate_cateId="+input;
                }

                System.out.println("===location list===\n0.All Location\n1.SIT Building\n2.KFC\n3.CB1\n4.CB2");
                System.out.print("Enter location (number) : ");
                input = sc.nextInt();
                if(input!=0){
                    if(condition.equals("")){
                        condition="Where Location_locationId="+input;
                    }else{
                        condition+=" AND Location_locationId="+input;
                    }
                }
            }
            LostItem item[] = LostItem.getAllLostItem(condition);
            for(int i=0;i<item.length;i++){
                System.out.println((i+1)+"."+item[i]);
            }
            System.out.print("select Item (number) : ");
            input = sc.nextInt();
            ItemStatus stat = ItemStatus.getItemStatus();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
