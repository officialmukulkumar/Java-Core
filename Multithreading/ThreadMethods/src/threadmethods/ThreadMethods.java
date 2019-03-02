package threadmethods;

class A extends Thread {

    @Override
    public void run() {
        System.out.println("A :1");
        System.out.println("A :2");
        System.out.println("A :3");
        System.out.println("A :4");
        stop();
        System.out.println("A :5");
        System.out.println("Existing Thread A");
    }

}

class B extends Thread {

    @Override
    public void run() {
        System.out.println("B :1");
        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("B :2");
        System.out.println("B :3");
        System.out.println("B :4");
        System.out.println("B :5");
        System.out.println("Existing Thread B");
    }

}

public class ThreadMethods {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println("Start Thread A");
        a.start();
        System.out.println("Start Thread B");
        b.start();

    }

}
