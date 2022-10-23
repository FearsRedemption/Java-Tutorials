public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.activeCount());
//        Thread.currentThread().setName("MAINNNNNNNNNNNNNNNN");
//        System.out.println(Thread.currentThread().getName());

//        Thread.currentThread().setPriority(10); //10 (highest) to 1 (lowest)
//        System.out.println(Thread.currentThread().getPriority());

//        System.out.println(Thread.currentThread().isAlive());
//        for (int i = 3; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }

        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        System.out.println(myThread.isDaemon());
        myThread.start();

        //System.out.println(myThread.isAlive());

        //myThread.setName("MyThread");
        //System.out.println(myThread.getName());

        //myThread.setPriority(1);
        //System.out.println(myThread.getPriority());

        //System.out.println(Thread.activeCount());
    }
}