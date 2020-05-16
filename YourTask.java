/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbjb2
 */
import java.io.File;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class YourTask extends TimerTask{
    Twitter twitter;
    public YourTask() {
        twitter = TwitterFactory.getSingleton();
        run();
    }
    
    public void run() {
        File folder = new File("Kard_Pics");
        int folderLength = folder.listFiles().length;
        
        File file = new File("Kard_Pics\\Kard" + ((int)(Math.random() * folderLength) + 1) + ".jpg");
        StatusUpdate status = new StatusUpdate("");
        status.setMedia(file);
        try {
            twitter.updateStatus(status);
        } catch (TwitterException ex) {
            Logger.getLogger(YourTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
