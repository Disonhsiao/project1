import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class PanelClass extends JPanel{
    private JPanel jPanel;
    private JButton stringBtn = null;
    private JButton numBtn = null;
    private JButton carBtn = null;
    private JButton fruitBtn = null;
    private JLabel backgroundLable = null;
    private Image bgImage = new ImageIcon("img/0525.png").getImage();
    
    private PanelClass(JFrame jFrame){
        setLayout(null);
        System.out.println("PanelClass");
        jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, sortApp.width, sortApp.height);

        
    //	bglabel
		backgroundLable = new aLabel(bgImage);
		backgroundLable.setBounds(0, 0,  sortApp.width, sortApp.height);
		backgroundLable.setOpaque(true);

    //  setStringBtn
        if(stringBtn == null){
            stringBtn = new JButton("String");
            stringBtn.setBounds(120, 115, 120, 28);

            stringBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == stringBtn){
                        PanelIndex.mode = 2;
                        jFrame.setContentPane(PanelIndex.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //  setNumBtn
        if(numBtn == null){
            numBtn = new JButton("Numbers");
            numBtn.setBounds(120, 145, 120, 28);

            numBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==numBtn){
                        PanelIndex.mode = 1;
                        jFrame.setContentPane(PanelIndex.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //  setCarBtn
        if(carBtn == null){
            carBtn = new JButton("Cars");
            carBtn.setBounds(120, 175, 120, 28);

            carBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == carBtn){
                        PanelIndex.mode = 3;
                        jFrame.setContentPane(PanelIndex.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //  setFruitBtn
        if(fruitBtn == null){
            fruitBtn = new JButton("Fruits");
            fruitBtn.setBounds(120, 205, 120, 28);

            fruitBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==fruitBtn){
                        PanelIndex.mode = 4;
                        jFrame.setContentPane(PanelIndex.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

        jPanel.add(stringBtn);
        jPanel.add(numBtn);
        jPanel.add(carBtn);
        jPanel.add(fruitBtn);
        jPanel.add(backgroundLable);
        add(jPanel);
    }

    public static PanelClass getInstance(JFrame jFrame){
        PanelClass PanelClass = new PanelClass(jFrame);
        return PanelClass;
    }
}