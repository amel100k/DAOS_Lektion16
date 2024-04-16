public class Tråd extends Thread{
    private String name;
    private Common x;

    public Tråd(String name, Common x) {
        this.name = name;
        this.x = x;
    }

    public void run() {
        for
        (int j = 0; j < 100; j++) {
            x.updateGlobal();
            x.TagerRanTid(200);
            System.out.println(x.getGlobal());
        }

    }
}
