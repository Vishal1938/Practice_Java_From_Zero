package com.collection;

import java.util.Timer;
import java.util.TimerTask;

class Reminder{
    Timer timer;
    public Reminder(int seconds){
        timer =new Timer();
        timer.schedule(new ReminderTask(),seconds*10);
    }
    class ReminderTask extends TimerTask{
        public void run(){
            System.out.println("Time's up");
            timer.cancel();

        }
    }
}
public class Workbook_13 {
    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new Reminder(5);
        System.out.println("Task scheduled.");
    }
}
