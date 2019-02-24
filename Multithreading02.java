
 
package multithreading02;


class A extends Thread{

    @Override
    public void run() {
       System.out.println("A :1");
       System.out.println("A :2");
       System.out.println("A :3");
       System.out.println("A :4");
       System.out.println("A :5");
       System.out.println("A :1");
       System.out.println("A :2");
       System.out.println("A :3");
       System.out.println("A :4");
       System.out.println("A :5");
    }



}

class B extends Thread{

    @Override
    public void run() {
       System.out.println("B :1");
       System.out.println("B :2");
       System.out.println("B :3");
       System.out.println("B :4");
       System.out.println("B :5");
    }

}

class C extends Thread{

    @Override
    public void run() {
       System.out.println("C :1");
       System.out.println("C :2");
       System.out.println("C :3");
       System.out.println("C :4");
       System.out.println("C :5");
    }

}

public class Multithreading02 {

    public static void main(String[] args) {
        
        System.out.println("Start of Main");
        A a = new A ();
        a.start();
        B b = new B ();
        b.start();
        System.out.println("Mid of Main");
        C c = new C ();
        c.start();
        System.out.println("End of Main");
        
    }
    
}

