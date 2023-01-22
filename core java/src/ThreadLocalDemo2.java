public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        CustomerThread c1=new CustomerThread("CustomerThread-1");
        CustomerThread c2=new CustomerThread("CustomerThread-2");
        CustomerThread c3=new CustomerThread("CustomerThread-3");
        CustomerThread c4=new CustomerThread("CustomerTHread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
class CustomerThread extends Thread{
    static Integer CustId=0;
    private static ThreadLocal tl=new ThreadLocal(){
        protected Integer initialValue(){
            return ++CustId;
        }
    };
    CustomerThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Executing with Customer id: "
                +tl.get());
    }
}