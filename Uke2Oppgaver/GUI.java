import javax.swing.JFrame;


public class GUI {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400; 
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT); 
        frame.setTitle("An empty frame"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
