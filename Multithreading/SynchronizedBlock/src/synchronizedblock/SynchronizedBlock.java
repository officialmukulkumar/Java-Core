package synchronizedblock;

class Math {

    int x, y;

    void add(int a, int b) {
        System.out.println("Hello");
        System.out.println("Hye");
        synchronized (this) {
            x = a;
            y = b;
            try {
                Thread.sleep(4000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            int s = x + y;
            System.out.println("Addition " + s);
        }
    }

}

class A extends Thread {

    Math m;

    A(Math t) {
        m = t;

    }

    @Override
    public void run() {
        m.add(4, 10);
    }

}

class B extends Thread {

    Math m;

    B(Math t) {
        m = t;

    }

    @Override
    public void run() {
        m.add(20, 10);
    }

}

public class SynchronizedBlock {

    public static void main(String[] args) {

        Math m1 = new Math();
        B b = new B(m1);
        b.start();
        new A(m1).start();

    }

}
