package deadlockex;

class A extends Thread {

    String r1, r2;

    A(String s1, String s2) {

        r1 = s1;
        r2 = s2;

    }

    @Override
    public void run() {
        synchronized (r1) {
            System.out.println("Thread 1 : Locked Resource 1");
            try {
                Thread.sleep(400);

            } catch (Exception e) {
                System.out.println(e);
            }
            synchronized (r2) {
                System.out.println("Thread 1 : Locked Resource 2");
            }
        }

    }

}

class B extends Thread {

    String r1, r2;

    B(String s1, String s2) {

        r1 = s1;
        r2 = s2;

    }

    @Override
    public void run() {
        synchronized (r2) {
            System.out.println("Thread 2 : Locked Resource 2");
            try {
                Thread.sleep(400);

            } catch (Exception e) {
                System.out.println(e);
            }
            //This is causing Deadlock
//            synchronized (r1) {
//                System.out.println("Thread 2 : Locked Resource 1");
//            }
        }
        //Solution to Deadlock
        synchronized (r1) {
            System.out.println("Thread 2 : Locked Resource 1");
        }
    }

}

public class DeadlockEx {

    public static void main(String[] args) {

        String resource1 = "Mukul";
        String resource2 = "Kumar";
        A a = new A(resource1, resource2);
        B b = new B(resource1, resource2);
        a.start();
        b.start();

    }

}
