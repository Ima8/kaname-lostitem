/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostitemproject;

/**
 *
 * @author POOM
 */
public class TestProject {
    public static void main(String[] args) {
        Account user = new Account();
        String str1="hello";
        String str2="hello";
        System.out.println(str1.equals(str2));
        
        boolean loginSuccess = user.login("poom","yeah");
        while(!loginSuccess){
            loginSuccess = user.login("poom","yeah");
        }
        LostItem.addNewLostItem(String itemName, String itemDescription, int itemType,user.getAccId())
        
        
        /*
        //เริ่มต้นโดยกำหนดตัวแปร Type Image เป็น null
        Image image=null;
        //try-catch เพื่อรองรับการเกิด exception
        try {
            //นำ url ภาพจาก internet โดยใช้ absolute path มาเป็นในตัวแปร url
            URL url = new URL("https://upload.wikimedia.org/wikipedia/en/5/5f/Original_Doge_meme.jpg");
            //ใช้ ImageIO.read ในการอ่านภาพจาก url
            image = ImageIO.read(url);
        } catch (IOException e) {
            System.out.println("Invalid url");
        }

        // ใช้ label ในการแสดงผลภาพ
        // เริ่มแรกให้สร้าง frame สำหรับแสดงผลด้วย JFrame
        JFrame frame = new JFrame();
        //JLabel ใช้แสดงข้อความหรือรูปภาพในหน้าจอ frame ,จึงใช้ lblimage เก็บรูป
        //แต่ JLabel constructor สามารถรับแค่ type Icon กับ String
        //จึงใช้ ImageIcon ซึ่งได้ข้อมูลรูปไปจาก image
        //(ImageIcon เป็น subclass ของ Icon. JLabel จึงรับได้)
        JLabel lblimage = new JLabel(new ImageIcon(image));
        //add lblimage เข้าไปใน frame
        frame.getContentPane().add(lblimage, BorderLayout.CENTER);
        //ปรับ size ของ frame
        frame.setSize(500, 400);
        //ทำให้ frame สามารถมองเห็นได้ (visible)
        frame.setVisible(true);
        */
    }
}
