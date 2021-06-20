public class TestTallMonitor {
    public static void main(String[]args){
        Tallmonitor monitor = new Tallmonitor();
        new Thread(new Nedover(monitor)).start();
        new Thread(new Oppover(monitor)).start();
    }
}
