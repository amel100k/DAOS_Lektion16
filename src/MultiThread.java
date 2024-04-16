public class MultiThread extends Thread{
    public void run() {
        for (int i = 0; i <=5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
            }
        }
    }
}
