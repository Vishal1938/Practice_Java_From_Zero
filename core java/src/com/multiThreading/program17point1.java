package com.multiThreading;

public class program17point1 {
    public static void main(String[] args) {
        jtcThread11 ath=new jtcThread11();
        jtcThread22 bth=new jtcThread22();
        bth.setThreadToJoin(ath);
        ath.start();
        bth.start();
    }
}
class jtcThread11 extends Thread{
    public void run(){
        for(int i=0;i<15;i++) {
            System.out.println("JTH1\t" + i);
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class jtcThread22 extends Thread{
    Thread th=null;
    void setThreadToJoin(Thread th){
        this.th=th;
    }
    public void run(){
        for(int i=0;i<25;i++){
            System.out.println("JTH2\t"+i);
            try{
                if(i==20){
                    th.join();
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}