
package threadinterruptionex;


class A extends Thread{

    @Override
    public void run() {
       System.out.println("Hello");
        try {
            Thread.sleep(2000);
            System.out.println("Task");
        } catch (Exception ex) {
            System.out.println(ex);
        }
       System.out.println("Thread is Running");
       
    }
}

public class ThreadInterruptionEx {

    public static void main(String[] args) {
       
        A a = new A();
        a.start();
        a.interrupt();
        
        
    }
    
}
