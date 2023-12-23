import javax.swing.*;
import java.awt.*;

public class sortApp extends JFrame{
    private static sortApp single = null;

    //style
    static int width = 1000;
    static int height = 700;
    static int width2 = width/2;
    static int height2 = height/2;

    public static sortApp getInstance(){
        if(single==null)
        single = new sortApp();
        return single;
    }

    public static void main(String args[]){
        sortApp sortApp = new sortApp();
        sortApp.setTitle("Let's Sort !");
        sortApp.setVisible(true);
    }

    private sortApp(){
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
        setContentPane(PanelIndex.getInstance(this));
    }
}



    // private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    // private int width = (int)(screen.getWidth()*0.8);
    // private int height = (int)(screen.getHeight()*0.8);

    // private Image bgImage = new ImageIcon("img/0525.png").getImage();
    // private Icon bgIcon = new ImageIcon(getClass().getResource("img/0525.png"));