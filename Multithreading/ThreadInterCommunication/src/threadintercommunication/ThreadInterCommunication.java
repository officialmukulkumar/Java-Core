package threadintercommunication;

class Shared {

    int flag = 0, data = 0;

    synchronized void submit() {
        flag = 1;
        try {
            Thread.sleep(200);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        data = 10000;
        System.out.println("Value Submitted");
        notify();

    }

    synchronized int withdraw() {
        if (flag == 0) {
            try {
                System.out.println("Wait Block");
                wait();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return data;
    }

}

class A extends Thread {

    Shared s;

    A(Shared t) {

        s = t;

    }

    @Override
    public void run() {
        System.out.println(s.withdraw());

    }

}

class B extends Thread {

    Shared s;

    B(Shared t) {

        s = t;

    }

    @Override
    public void run() {
        s.submit();

    }

}

public class ThreadInterCommunication {

    public static void main(String[] args) {

        Shared obj = new Shared();
        A a = new A(obj);
        B b = new B(obj);
        b.start();
        a.start();

    }

}
