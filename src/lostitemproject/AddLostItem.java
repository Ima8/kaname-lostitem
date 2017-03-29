/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostitemproject;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author POOM
 */
public class AddLostItem {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        String name,des,date;
        int owner,cate,location,accountId=1,itemId;
        System.out.print("Enter name : ");
        name=sc.nextLine();
        System.out.print("Enter Description : ");
        des=sc.nextLine();
        System.out.println("===category list===\n1.device\n2.costume\n3.Bag\n4.Key\n5.Other");
        System.out.print("Enter Item category (number) : ");
        cate=sc.nextInt();
        System.out.println("===location list===\n1.SIT Building\n2.KFC\n3.CB1\n4.CB2");
        System.out.print("Enter location (number) : ");
        location=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Lost Date(YYYY-MM-DD) : ");
        date=sc.nextLine();
        
        try {
            itemId = LostItem.addNewLostItem(name,des,accountId,cate,date);
            System.out.println("itemId return = "+itemId);
            ItemStatus.addStatus(location, itemId, accountId,1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
