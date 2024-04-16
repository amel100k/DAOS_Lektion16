public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            MultiThread thread = new MultiThread();
            thread.start();
        }
    }
}