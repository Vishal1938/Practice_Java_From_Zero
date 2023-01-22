public class ThreadSleep {
    public static void main(String[] args) {
        MyThread333 t=new MyThread333();
        t.start();
        t.interrupt();
        System.out.println("End of main Methode");
    }
}
class MyThread444 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am lazy thread-" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}