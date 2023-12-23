import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

public class PanelIndex extends JPanel{
    private JLabel title = null;
    private JPanel jPanel;
    private Image bgImage = new ImageIcon("img/0525.png").getImage();
    private Icon titleIcon = new ImageIcon(getClass().getResource("img/title.gif"));

    private JLabel backgroundLable = null;
	private JTextField inputField = null;

	private JButton randomBtn = null;
    private JButton startBtn = null;
    private JButton sortModeBtn = null;
    private JButton classModeBtn = null;
    private JButton orderModeBtn = null;
    private JButton errorBtn = null;

	//1:number 2:String 3:Car 4.Fruit
	static int mode = 1;
	
	//1:Ascending 2:Descending
	static int order = 1;
    
    static String sortModeTmp = "I";
    
	private JFileChooser fileChooser =new JFileChooser("database/");
    
	private Files files = new Files();
	private check check = new check();
	private Seperate sep = new Seperate();
	private insertionSort IS = new insertionSort();
	private selectionSort SL = new selectionSort();
	private exchangeSort EX = new exchangeSort();
	private mergeSort MG = new mergeSort();
	private bubbleSort BB = new bubbleSort();
	private quickSort QK = new quickSort();
	private sortApp2 sort2 = null;
    
	ArrayList<String> S1 = new ArrayList<String>();
	ArrayList<ArrayList<Car>> S2 = new ArrayList<ArrayList<Car>>();
	ArrayList<ArrayList<Double>> S3 = new ArrayList<ArrayList<Double>>();
	ArrayList<ArrayList<String>> S4 = new ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<Fruit>> S5 = new ArrayList<ArrayList<Fruit>>();
	ArrayList<ArrayList<Integer>> C1 = new ArrayList<ArrayList<Integer>>();

    public PanelIndex(){
    }

    private PanelIndex(final JFrame jFrame){
        setLayout(null);
        System.out.println("PanelIndex");
        jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, 1000, 650);

    //	bglabel
        backgroundLable = new aLabel(bgImage);
        backgroundLable.setBounds(0, 0,  sortApp.width, sortApp.height);
        backgroundLable.setOpaque(true);
            
    //  set title
        title = new JLabel(titleIcon);
        title.setBounds(sortApp.width2-(titleIcon.getIconWidth()/2), 75, titleIcon.getIconWidth(), titleIcon.getIconHeight());
        // System.out.println( titleIcon.getIconWidth() + " , " + titleIcon.getIconHeight() );
    
    //	MenuBar
        JMenuBar MBar = new JMenuBar();
        JMenu newFile = setMenuFile();
        MBar.setOpaque(true);
        MBar.add(newFile);
        jFrame.setJMenuBar(MBar);

	//  inputField
        inputField = new JTextField(30);
        inputField.setBounds(new Rectangle(sortApp.width2-333, sortApp.height2-100, 600, 25));

    //  setSortModeBtn
        if(sortModeBtn == null){
            sortModeBtn = new JButton("Sort Mode");
            sortModeBtn.setBounds(sortApp.width2-60, sortApp.height2-10, 120, 30);

            sortModeBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==sortModeBtn){
                        jFrame.setContentPane(PanelSort.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //  setClassModeBtn
        if(classModeBtn == null){
            classModeBtn = new JButton("Class Mode");
            classModeBtn.setBounds(sortApp.width2-60, sortApp.height2+30, 120, 30);

            classModeBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==classModeBtn){
                        jFrame.setContentPane(PanelClass.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //  setOrderModeBtn
        if(orderModeBtn == null){
            orderModeBtn = new JButton("Order Mode");
            orderModeBtn.setBounds(sortApp.width2-60, sortApp.height2+70, 120, 30);

            orderModeBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==orderModeBtn){
                        jFrame.setContentPane(PanelOrder.getInstance(jFrame));
                        jFrame.validate();
                    }
                }
            });
        }

    //  add
        jPanel.add(title);
        jPanel.add(inputField);
        jPanel.add(sortModeBtn);
        jPanel.add(classModeBtn);
        jPanel.add(orderModeBtn);
        jPanel.add(setStartBtn());
        jPanel.add(setRandomBtn());
		jPanel.add(setErrorBtn());
        jPanel.add(backgroundLable);
        add(jPanel);
        // add(backgroundLable);
    }

    private JMenu setMenuFile() {
		JMenu File = new JMenu("File");
		JMenuItem OpenFile = new JMenuItem("Open File...");
		File.setMnemonic('F');
		OpenFile.setMnemonic('O');

		OpenFile.addActionListener(
			new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {				
					String tmp = null;
					File file=null;
					int result;
					
					fileChooser.setApproveButtonText("make sure");
					fileChooser.setDialogTitle("Open file");
					result=fileChooser.showOpenDialog(null);

					if(result==JFileChooser.APPROVE_OPTION)
						file=fileChooser.getSelectedFile();
					else if(result==JFileChooser.CANCEL_OPTION){}
	
					tmp=files.get_text(file);
					inputField.setText(tmp);
				}
			}
		);
		File.add(OpenFile);
		return File;
	}//end of buildStyleMenu()

//	setRandomBtn
	private JButton setRandomBtn() {//style
		if (randomBtn == null) {
			randomBtn = new JButton("random");
			randomBtn.setBounds(new Rectangle(sortApp.width2+275, sortApp.height2-100, 80, 25));
			randomBtn.addActionListener(
				new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {

						if( mode == 1 )
							inputField.setText(random.N_random());
						else if( mode == 2 )
							inputField.setText(random.S_random());
						else if( mode ==3 )
							inputField.setText(random.C_random());
						else if( mode ==4 )
						    inputField.setText(random.F_random());
					}
				}
			);
		}
		return randomBtn ;
	}

    private JButton setStartBtn() {
		if (startBtn == null) {
			startBtn = new JButton("START");
            startBtn.setBounds(sortApp.width2-60, sortApp.height2-50, 120, 30);

            startBtn.addActionListener(
				new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {

                    startBtnAction();
                    System.out.println(sortModeTmp);
					}
				}
			);
        }
        return startBtn;
    }


    public void startBtnAction(){
        boolean intCheck = true;
						
        if( mode == 1 && check.stringCheck(getNumbers()) != true )
            intCheck = false;
        if( mode == 3 && check.isCar(getNumbers()) != true )
            intCheck = false;
        if( mode == 4 && check.isFruit(getNumbers()) != true )
            intCheck = false;

        if( intCheck ){
            // System.out.println("NumbersSize:" + getNumbers().length());
            whichSort();
            sort2 = new sortApp2(mode,S1,S2,S3,S4,S5,C1);
        }
        else{
            System.out.println("Incorrect array format"); 
			JOptionPane.showMessageDialog(null, "Incorrect array format!", "Friendly reminder: Error !", 
			JOptionPane.ERROR_MESSAGE);
		}
	}

    
	public void whichSort(){
		S1.clear();
		S2.clear();
		S3.clear();
		S4.clear();
		S5.clear();
		C1.clear();
		switch(sortModeTmp){
			case "I":
				switch(mode){
					case 1:
						if( order == 2)//descending
							IS.DO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						else
							IS.AO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						break;

					case 2:
						if( order == 2 ){//descending
							IS.DO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
							System.out.println("s4 sortApp size"+S4.size());
                            for(int i=0; i<S4.size();i++) {
                                for(int j=0;j<S4.get(i).size();j++) {
                                    System.out.print(S4.get(i).get(j)+" ");
                                }
                            System.out.println();
                            }           
						}
						else{
							IS.AO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
							System.out.println("s4 sortApp size"+S4.size());
							for(int i=0; i<S4.size();i++) {
                                for(int j=0;j<S4.get(i).size();j++) {
                                    System.out.print(S4.get(i).get(j)+" ");
                                }
                            System.out.println();
                            }
						}          
						break;
				
					case 3:
						if( order == 2 )//descending
							IS.DO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						else
							IS.AO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						break;
						
					case 4:
						if( order == 2 )//descending
							IS.DO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						else
							IS.AO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						break;
				}
				break;

			case "S":
			    System.out.println("selection chosen");
				switch(mode){
					case 1:
						if( order == 2)//descending
							SL.DO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						else
							SL.AO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						break;

					case 2:
					    System.out.println("Strintmp:"+getNumbers());	
						System.out.println("order:"+order);	
						if( order == 2 )//descending
							SL.DO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						else
							SL.AO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						System.out.println("s4 sortApp size"+S4.size());	
						break;
					
					case 3:
						if( order == 2 )//descending
							SL.DO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						else
							SL.AO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						break;
						
					case 4:
						if( order == 2 )//descending
							SL.DO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						else
							SL.AO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						break;
				}
				break;

			case "E":
				switch(mode){
					case 1:
						if( order == 2)//descending
							EX.DO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						else
							EX.AO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						break;

					case 2:
						if( order == 2 )//descending
							EX.DO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						else
							EX.AO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						break;
					
					case 3:
						if( order == 2 )//descending
							EX.DO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						else
							EX.AO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						break;
						
					case 4:
						if( order == 2 )//descending
							EX.DO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						else
							EX.AO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						break;
				}
				break;

			case "M":
				switch(mode){
					case 1:
						if( order == 2)//descending
							MG.DO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						else
							MG.AO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						break;

					case 2:
						if( order == 2 )//descending
							MG.DO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						else
							MG.AO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						break;
					
					case 3:
						if( order == 2 )//descending
							MG.DO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						else
							MG.AO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						break;
						
					case 4:
						if( order == 2 )//descending
							MG.DO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						else
							MG.AO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						break;
				}
				break;

			case "B":
				switch(mode){
					case 1:
						if( order == 2)//descending
							BB.DO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						else
							BB.AO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						break;

					case 2:
						if( order == 2 )//descending
							BB.DO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						else
							BB.AO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						break;
					
					case 3:
						if( order == 2 )//descending
							BB.DO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						else
							BB.AO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						break;
						
					case 4:
						if( order == 2 )//descending
							BB.DO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						else
							BB.AO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						break;
				}
				break;

			case "Q":
				switch(mode){
					case 1:
						if( order == 2)//descending
							QK.DO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						else
							QK.AO_sort(sep.Seperate_N(getNumbers()),S1,S3,C1);
						break;

					case 2:
						if( order == 2 )//descending
							QK.DO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						else
							QK.AO_sort(sep.Seperate_S(getNumbers()),S1,S4,C1);
						break;
					
					case 3:
						if( order == 2 )//descending
							QK.DO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						else
							QK.AO_sort(sep.Seperate_C(getNumbers()),S1,S2,C1);
						break;
						
					case 4:
						if( order == 2 )//descending
							QK.DO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						else
							QK.AO_sort(sep.Seperate_F(getNumbers()),S1,S5,C1);
						break;
				}
				break;

			default:
				break;
		}
	}
	
    
	public String getNumbers(){
		String numbers = inputField.getText();
		return numbers;
	}

    public static PanelIndex getInstance(JFrame jFrame){
        PanelIndex PanelIndex = new PanelIndex(jFrame);
        return PanelIndex;
    }






	/////////////////////
	//	setErrorBtn
	private JButton setErrorBtn() {//style
		if (errorBtn == null) {
			errorBtn = new JButton("input clear");
			errorBtn.setBounds(new Rectangle(sortApp.width2+275, sortApp.height-150, 160, 25));
			errorBtn.addActionListener(
				new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						/*JOptionPane.showMessageDialog(null, "something goes wrong!", "Error", 
						JOptionPane.ERROR_MESSAGE);
						*/
						inputField.setText("");
					}
				}
			);
		}
		return errorBtn ;
	}
}