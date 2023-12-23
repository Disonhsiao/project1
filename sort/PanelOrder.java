import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class PanelOrder extends JPanel{
    private JPanel jPanel;
    private JButton ascBtn = null;
    private JButton descingBtn = null;
    private JLabel backgroundLable = null;
    private Image bgImage = new ImageIcon("img/0525.png").getImage();
    
    private PanelOrder(JFrame jFrame){
        setLayout(null);
        System.out.println("Panel_Order");
        jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, sortApp.width, sortApp.height);

        
    //	bglabel
		backgroundLable = new aLabel(bgImage);
		backgroundLable.setBounds(0, 0,  sortApp.width, sortApp.height);
		backgroundLable.setOpaque(true);

    //  setAscendingBtn
        if(ascBtn == null){
            ascBtn = new JButton("Ascending");
            ascBtn.setBounds(120, 115, 120, 28);

            ascBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == ascBtn){
                        PanelIndex.order = 1;
                        jFrame.setContentPane(PanelIndex.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //  setDescendingBtn
        if(descingBtn == null){
            descingBtn = new JButton("Descending");
            descingBtn.setBounds(120, 145, 120, 28);

            descingBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==descingBtn){
                        PanelIndex.order = 2;
                        jFrame.setContentPane(PanelIndex.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

        jPanel.add(ascBtn);
        jPanel.add(descingBtn);
        jPanel.add(backgroundLable);
        add(jPanel);
    }

    public static PanelOrder getInstance(JFrame jFrame){
        PanelOrder PanelOrder = new PanelOrder(jFrame);
        return PanelOrder;
    }
}