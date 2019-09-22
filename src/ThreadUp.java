public class ThreadUp extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "-UP");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
