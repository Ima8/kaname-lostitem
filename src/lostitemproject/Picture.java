package lostitemproject;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class Picture {
    private int pictureId;
    private String path;

    public Picture() {
    }

    public int getPictureId() {
        return pictureId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public Picture(String path) {
        
    }
    //getPicture
        //logic
        //url = ....
        //return ImageIO.read(url);
    public static BufferedImage getPicture(int itemId){
        BufferedImage image = null;
        URL url;
        try {
            url = new URL("https://upload.wikimedia.org/wikipedia/en/5/5f/Original_Doge_meme.jpg");
            image = ImageIO.read(url);
        } catch (IOException ex) {
            System.out.println("Invalid url");
        }catch (Exception ex) {
            System.out.println("Invalid url");
        }
        return image;
    }
    public static boolean uploadPic(){
        FTPClient ftpClient = new FTPClient();
        InputStream inputStream = null;
        String pathStr=null;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            pathStr=chooser.getSelectedFile().toString();
            System.out.println(pathStr);
            File picFile = new File(pathStr);
            try {
                ftpClient.connect("93.188.160.226", 21);
                ftpClient.login("u782694326", "kamkam1234");
                ftpClient.enterLocalPassiveMode();
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                long time=System.currentTimeMillis();
                inputStream = new FileInputStream(picFile);

                String destination = UUID.randomUUID().toString();

                if(ftpClient.storeFile(destination, inputStream))
                    return true;
            } catch (Exception ex) {
                return false;
            }
            finally{
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        
        
        return true;
        /*BufferedImage img = null;
        boolean result=true;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        //JLabel lblimage = new JLabel();
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //lblimage.setText(chooser.getSelectedFile().toString());
        }
        try {
            //นำ url ภาพจาก internet โดยใช้ absolute path มาเป็นในตัวแปร url

            //URL url = new URL(chooser.getSelectedFile().toString());
            //ใช้ ImageIO.read ในการอ่านภาพจาก url
            img = ImageIO.read(new File(chooser.getSelectedFile().toString()));
        } catch (IOException e) {
            result =false;
        }
        return result;*/
    }
}
