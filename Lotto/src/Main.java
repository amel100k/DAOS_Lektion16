import java.util.Random;
public class Main {
    public static void main(String[] args) {

    }
    public boolean[] raek = new boolean[37];
    public Main() {
        for (int j=0; j < 37; j++)
            raek[j] = false;
        int ant = 0;
        Random r=new Random();
        while (ant < 7) {
            int tal = Math.abs(r.nextInt()) % 36 + 1;
            if (!raek[tal]) {
                raek[tal] = true;
                ant ++;
            }
        }
    };
    public int antalrigtige(Main rigtig) {
        int x =0;
        for (int j=1; j < 37; j++)
            if (this.raek[j] && rigtig.raek[j])
                x ++;
        return x;
    };
};
