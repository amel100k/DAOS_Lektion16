public class Main {
    public static void main(String[] args) {
        Common common = new Common();
        common.start();
        Tråd tråd = new Tråd("første", common);
        tråd.start();

        Common common2 = new Common();
        common2.start();
        Tråd tråd2 = new Tråd("anden", common2);
        tråd2.start();



    }
}