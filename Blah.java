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
import java.time.*;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



public class Blah {
    public static void main(String[] args) {
        /*File folder = new File("Kard_Pics");
        long folderLength = folder.listFiles().length;
        System.out.println(folderLength);*/
        
        /*int num = (int)(Math.random() * 38) + 1;
        
        for (int i = 0; i < 50; i++) {
            System.out.println(num);
            num = (int)(Math.random() * 38) + 1;
        }*/
        /*Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 40);
        date.set(Calendar.SECOND, 0);
        
        Timer timer = new Timer();
       
        timer.schedule(new YourTask(), date.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));*/
        
        /*int newVal = (int)(Math.random() * 1000) + -500;
        
        
        for (int i = 0; i < 100; i++) {
        System.out.println(newVal);
        newVal = (int)(Math.random() * 21) + -10;
        }
        
        String yay = "101 2 32 12 4543 3 ";
        int numsss = 32;
        System.out.println(yay.contains("" + numsss));*/
        
        /*int n = 1000;

        int[] ans = new int[n];
        if (n == 1) {
            ans[0] = 0;
        }
        else {
            ans[0] = (int)(Math.random() * (2 * n + 1)) + -(n / 2);
            String numsStr = ans[0] + " ";
            int total = ans[0];
            
            for (int i = 1; i < n - 1; i++) {
                int newVal;
                do {
                    newVal = (int)(Math.random() * (2 * n + 1)) + -(n / 2);
                } while (numsStr.contains(newVal + ""));
                
                ans[i] = newVal;
                numsStr += newVal + " ";
                total += newVal;
            }
            
            int leftover = 0 - total;
            
            while (numsStr.contains(leftover + "")) {
                int newVal2 = ans[0];
                ans[0] = (int)(Math.random() * (2 * n + 1)) + -(n / 2);
                leftover += (newVal2 - ans[0]);
            }
    
            ans[n - 1] = leftover;
        }
        
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        
        /*LocalTime time = LocalTime.of(23, 43, 00, 000);
        
        if (LocalTime.now().equals(time)) {
            System.out.println("hi");
        }*/
        String name = "Sydney";
        char[] nameArr = name.toCharArray();
        
        for (char i : nameArr) {
            System.out.println(i);
        }
        
        System.out.println(("Cherie").compareTo("Amber"));
        /*ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        
        Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 37);
        date.set(Calendar.SECOND, 0);
        
        int min = date.get(Calendar.MINUTE);
        int targetMin = 37;
        int delay = min < targetMin ? targetMin - min : targetMin - min + 60;
        scheduler.scheduleAtFixedRate(new YourTask(), delay, 2, TimeUnit.MINUTES);*/
    }
    
}

