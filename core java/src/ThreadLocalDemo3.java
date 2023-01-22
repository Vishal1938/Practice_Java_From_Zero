public class ThreadLocalDemo3 {
    public static void main(String[] args) {
        ParentThread pt=new ParentThread();
        pt.start();
    }
}
class ParentThread extends Thread {
    public static InheritableThreadLocal t1 = new InheritableThreadLocal(){
        public Object childValue(Object P) {
            return "cc";
        }
    };
public void run() {
    t1.set("pp");
    System.out.println("Parent Thread Value___"+t1.get());
    ChildThread ct=new ChildThread();
    ct.start();
}
}
class ChildThread extends Thread{
    public void run(){
        System.out.println("childThread value___"+ParentThread.t1.get());
    }
}
