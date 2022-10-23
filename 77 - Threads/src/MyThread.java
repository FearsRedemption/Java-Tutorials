public class MyThread extends Thread {
    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("This is a Daemon thread");
        } else {
            System.out.println("This is a User thread");
        }
    }
}
