import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class PanelSort extends JPanel{
    private JPanel jPanel;
    private JButton backBtn = null;
	private JComboBox comboBox = null;

    private JLabel backgroundLable = null;
    private JLabel windowLable = null;
	private JLabel MethodLable = null;
    private Image bgImage = new ImageIcon("img/0525.png").getImage();
    private Image windowImage = new ImageIcon("img/sortBg.png").getImage();
    private Icon windowIcon = new ImageIcon(getClass().getResource("img/sortBg.png"));
    private Icon goIcon = new ImageIcon(getClass().getResource("img/go.png"));

	private ImageIcon ISpho = new ImageIcon("img/insertion.png");
	private ImageIcon SLpho = new ImageIcon("img/selection.png");
	private ImageIcon EXpho = new ImageIcon("img/exchange.png");
	private ImageIcon BBpho = new ImageIcon("img/bubble.png");
	private ImageIcon QKpho = new ImageIcon("img/quick.png");
	private ImageIcon MGpho = new ImageIcon("img/merge.png");

	// private PanelIndex index = new PanelIndex();

    private PanelSort(JFrame jFrame){
        setLayout(null);
        System.out.println("PanelSort");
        jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, sortApp.width, sortApp.height);


    //	bglabel
		backgroundLable = new aLabel(bgImage);
		backgroundLable.setBounds(0, 0,  sortApp.width, sortApp.height);
		backgroundLable.setOpaque(true);

	//	windowLable
        windowLable = new aLabel(windowImage);
        windowLable.setBounds( sortApp.width2-400, sortApp.height2-320,  windowIcon.getIconWidth(), windowIcon.getIconHeight());
        windowLable.setOpaque(true);
        // System.out.println( backgroundIcon.getIconWidth() + " , " + backgroundIcon.getIconHeight() );

		
	//	MethodLable
		MethodLable = new JLabel(ISpho);  
		MethodLable.setBounds(new Rectangle(sortApp.width2-391, sortApp.height2-195, 765, 415));
		MethodLable.setOpaque(true);
		MethodLable.setVisible(true);
		MethodLable.setBackground( new Color(255, 255, 255) );

    //setBackBtn
        if(backBtn == null){
            backBtn = new JButton(goIcon);
            backBtn.setBounds(sortApp.width2+284, sortApp.height2-223, 62, 23);
            backBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == backBtn){
                        jFrame.setContentPane(PanelIndex.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //comboBox
        comboBox = new JComboBox();
        comboBox.addItem("Insertion Sort");
        comboBox.addItem("Selection Sort");
        comboBox.addItem("Exchange Sort");
        comboBox.addItem("Merge Sort");
        comboBox.addItem("Bubble Sort");
        comboBox.addItem("Quick Sort");
		setComboBoxIndex();
        comboBox.setBounds(sortApp.width2-344, sortApp.height2-222, 628, 22);
        comboBox.setVisible(true);

    //add
		jPanel.add(setComboBox());
        jPanel.add(backBtn);
        jPanel.add(MethodLable);
        jPanel.add(windowLable);
        jPanel.add(backgroundLable);
        add(jPanel);
    }

	private void setComboBoxIndex(){
		switch(PanelIndex.sortModeTmp){
			case "I":
			MethodLable.setIcon(ISpho);
			comboBox.setSelectedIndex(0);
			break;

			case "S":
			MethodLable.setIcon(SLpho);
			comboBox.setSelectedIndex(1);
			break;

			case "E":
			MethodLable.setIcon(EXpho);
			comboBox.setSelectedIndex(2);
			break;

			case "M":
			MethodLable.setIcon(MGpho);
			comboBox.setSelectedIndex(3);
			break;
			
			case "B":
			MethodLable.setIcon(BBpho);
			comboBox.setSelectedIndex(4);
			break;
			
			case "Q":
			MethodLable.setIcon(QKpho);
			comboBox.setSelectedIndex(5);
			break;

			default:
			comboBox.setSelectedIndex(-1);
		}
	}


    private JComboBox setComboBox(){
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String sortMethod = (String) comboBox.getSelectedItem();//get the selected item
				switch (sortMethod) {
					case "Insertion Sort":
						System.out.println("Insertion Sort");
						MethodLable.setIcon(ISpho);
						PanelIndex.sortModeTmp = "I"; 
						break;

					case "Selection Sort":
						System.out.println("Selection Sort");
						MethodLable.setIcon(SLpho);
						PanelIndex.sortModeTmp = "S"; 
						break;

					case "Exchange Sort":
						System.out.println("Exchange Sort");
						MethodLable.setIcon(EXpho);
						PanelIndex.sortModeTmp = "E"; 
						break;

					case "Merge Sort":
						System.out.println("Merge Sort");
						MethodLable.setIcon(MGpho);
						PanelIndex.sortModeTmp = "M"; 
						break;

					case "Bubble Sort":
						System.out.println("Bubble Sort");
						MethodLable.setIcon(BBpho);
						PanelIndex.sortModeTmp = "B"; 
						break;

					case "Quick Sort":
						System.out.println("Quick Sort");
						MethodLable.setIcon(QKpho);
						PanelIndex.sortModeTmp = "Q"; 
						break;
						
				}
				// sortMethodChange();
				// System.out.println(index.getSortModeTmp());
			}
		});
		return comboBox;
	}

    public static PanelSort getInstance(JFrame jFrame){
        PanelSort PanelSort = new PanelSort(jFrame);
        return PanelSort;
    }
}