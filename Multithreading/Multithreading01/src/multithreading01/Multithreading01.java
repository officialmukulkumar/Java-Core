
package multithreading01;

class A implements Runnable{

    @Override
    public void run() {
       System.out.println("A :1");
       System.out.println("A :2");
       System.out.println("A :3");
       System.out.println("A :4");
       System.out.println("A :5");
    }



}

class B implements Runnable{

    @Override
    public void run() {
       System.out.println("B :1");
       System.out.println("B :2");
       System.out.println("B :3");
       System.out.println("B :4");
       System.out.println("B :5");
    }

}

class C implements Runnable{

    @Override
    public void run() {
       System.out.println("C :1");
       System.out.println("C :2");
       System.out.println("C :3");
       System.out.println("C :4");
       System.out.println("C :5");
    }

}

public class Multithreading01 {

    public static void main(String[] args) {
        
        System.out.println("Start of Main");
        A a = new A ();
        Thread t1 = new Thread(a);
        t1.start();
        B b = new B ();
        Thread t2 = new Thread(b);
        t2.start();
        System.out.println("Mid of Main");
        C c = new C ();
        Thread t3 = new Thread(c);
        t3.start();
        System.out.println("End of Main");
        
    }
    
}
