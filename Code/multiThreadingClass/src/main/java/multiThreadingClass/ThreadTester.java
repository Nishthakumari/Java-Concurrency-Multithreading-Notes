package multiThreadingClass;

public class ThreadTester {

    public static void main(String[] args) {

//        System.out.println("main is starting");
//        Thread thread1 = new Thread1("thread1");
//
//        thread1.start();
//
//
//        Thread thread2 = new Thread(new Thread2(), "thread2");
//        thread2.start();
//
//        Thread thread3 = new Thread(()->{
//            for(int i=10;i<15;i++)
//            {
//                System.out.println(Thread.currentThread() + ", "+i);
//            }
//        }, "thread3");
//
//        thread3.start();
//
//
//        System.out.println("main is ending");


        Stack stack = new Stack(5);

        new Thread(() -> {
            int counter = 0;
            while(++counter<10)
            {
                System.out.println("Pushed: "+stack.push(100));
            }
        }, "pusher").start();

        new Thread(() -> {
            int counter = 0;
            while(++counter<10)
            {
                System.out.println("Popped: "+stack.pop());
            }
        }, "popper").start();

        System.out.println("main is exiting");

    }
}
