package multiThreadingClass;

public class ThreadTester {

    public static void main(String[] args) {

        System.out.println("main is starting");
        Thread thread1 = new Thread1("thread1");
        thread1.setDaemon(true);
        thread1.start();
        System.out.println("main is ending");
    }
}
