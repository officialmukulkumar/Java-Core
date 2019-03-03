package multthreadingnosyncronizednotsharingresource;

class Math {

    int x, y;

    void add(int a, int b) {
        x = a;
        y = b;
        int s = x + y;
        System.out.println("Addition " + s);

    }

}

class A extends Thread {

    @Override
    public void run() {
        System.out.println("Hello A");
        Math m = new Math();
        m.add(4, 10);
        System.out.println("Bye A");
    }

}

class B extends Thread {

    @Override
    public void run() {
        System.out.println("Hello B");
        Math m = new Math();
        m.add(20, 10);
        System.out.println("Bye B");
    }

}

public class MultThreadingNoSyncronizedNOtSharingResource {

    public static void main(String[] args) {
        
        new A().start();
        B b = new B();
        b.start();

    }

}
