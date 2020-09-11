/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbjb2
 * Intended to tweet out a random picture of KARD every time a specified interval passed.
 */
import java.io.*;
import java.util.*;
import twitter4j.*;
import java.time.*;
import java.util.concurrent.TimeUnit;

public class KardBotMain {
    
    private static PrintStream consolePrint;
    
    public static void main(String[] args) throws TwitterException, IOException {
        consolePrint = System.out;
        
        TJTwitter bigBird = new TJTwitter(consolePrint);
        
        bigBird.tweetOut();

    }
}

class TJTwitter {
    private Twitter twitter;
    private PrintStream consolePrint;
    
    public TJTwitter(PrintStream console) {
        twitter = TwitterFactory.getSingleton();
    }
    
    // tweets out the given String in timed intervals
    public void tweetOut(String message) throws TwitterException, IOException {
        Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR_OF_DAY, 14);
        date.set(Calendar.MINUTE, 30);
        date.set(Calendar.SECOND, 0);
        
        Timer timer = new Timer();
        timer.schedule(new YourTask(), date.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)); 
    }
    
    // tweets out an image in timed intervals
    public void tweetOut() throws TwitterException, IOException {
        
        Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 40);
        date.set(Calendar.SECOND, 0);
        
        Timer timer = new Timer();
        timer.schedule(new YourTask(), date.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
        
    }
    
    // retweets new tweets from user with given String handle
    public void retweet(String handle) throws TwitterException, IOException {
        User user = twitter.showUser(handle);

        twitter.retweetStatus(user.getId());
    }
}