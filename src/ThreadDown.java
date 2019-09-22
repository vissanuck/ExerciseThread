public class ThreadDown extends Thread {
    public void run() {
        for (int i = 9; i > 0; i--) {
            System.out.println(i + "--DOWN");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
