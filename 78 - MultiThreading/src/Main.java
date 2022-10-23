public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Create a subclass of Thread
        MyThread thread1 = new MyThread();

        //or

        //implement Runnable interface and pass instance as an argument to Thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

//        thread1.setDaemon(true); if thread is Daemon it will close along with the crash in this example
//        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000); //leave empty for waiting until specified thread dies, or provide milliseconds before continuing
        thread2.start();

//        System.out.println(1/0);
    }
}