import java.util.Random;

public class Common extends Thread{
    private int global = 0;

    public int getGlobal() {
        return global;
    }

    public void TagerRanTid (int max)
    {
        int x,y;
        Random r = new Random(1023);
        int max2 = Math.abs(r.nextInt()) % max +1;
        for (int j=0; j<max2; j++) {
            for (int i=0; i<max2; i++) {
                x = i + j;
                y = i - j;
            }
        }
    }
     public void updateGlobal() {
         int temp;
         temp = global;
         //TagerRandomTid(xxx);
         global = temp + 1;

    }
}
