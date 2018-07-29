import java.awt.AWTException;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
 
/**
 * This program demonstrates how to capture a screenshot (full screen)
 * as an image which will be saved into a file.
 * @author www.codejava.net
 *
 */
public class FullScreenCaptureExample {
 
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "FullScreenshot." + format;
            
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
             
            System.out.println("A full screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
}