public class ThreadInteruption {
    public static void main(String[] args) {
        MyThread333 t=new MyThread333();
        t.start();
        t.interrupt();
        System.out.println("End of main");

    }
}
class MyThread333 extends Thread{
    public void run(){
        try{
            for (int i=0;i<5;i++){
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("i got interrupted");
        }
    }
}//         DONE COMPLETELY