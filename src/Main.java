
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        MouseMotionEventTester window = new MouseMotionEventTester();
        window.initialize();
        window.setTitle("Mouse Motion Events");
        window.setSize(500, 300);
        window.setLocation(100, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
