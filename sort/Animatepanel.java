import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.geom.*;
import javax.swing.event.*;
import java.lang.*;
import java.math.BigDecimal;



public class Animatepanel extends JPanel implements ActionListener{
	
	

	private JTextArea outputArea = null;
	private JScrollPane opaScrollPane = null;
	private JButton startBtn = null;
    private JButton pauseBtn = null;
    private JButton resumeBtn = null;
    private JButton resetBtn = null;
	
	
	private int tra_selection=0;
	private int fra_selection=0;
	
	
    private JLabel Jtra=null;
	private JLabel Jfra=null;
	private JLabel Jre = null;

	private boolean switchBool = false;
	private String S = null;

	private ArrayList<Float> X = new ArrayList<Float>();
	private ArrayList<Float> Y = new ArrayList<Float>();
	
	private ArrayList<Float> X_reset = new ArrayList<Float>();
	private ArrayList<Float> Y_reset = new ArrayList<Float>();
	
    private ArrayList<Integer> d =new ArrayList<Integer>();
	private ArrayList<String> in = new ArrayList<String>();
	
	
    private Color backGround = new Color(0, 126, 118);
    private Color cin =new Color(164,214,193);
    private Color word = new Color(92, 118, 100);
    private Color btn =new Color(225,167,140);

   // private JLabel[][] jb= new JLabel [20][20];
    private Timer timer=null;
    private int index1=0;
    private int index2=0;
	
	private int stepsize=0;
	private int element=0;
	private int tj=0;
	private int tl=1;
	//
	private trajectory  trj= new upcircle();
	private trajectory  trj2=new downcircle();
	private trajectory  trj3=new upsquare();
	private trajectory  trj4=new downsquare();
	private trajectory  trj5=new upoval();
	private trajectory  trj6=new downoval();
	private trajectory  trj7=new directmove();
	private trajectory  trj8=new uptri();
	private trajectory  trj9=new downtri();
	
	//
	private frame  f1= new d_el();
	private frame  f2= new d_rec();
	private frame  f3= new d_rrec();
	//parameter
	private int x_start=300;
	private int y_start=500;
	private int x_l=80;
	//
	private ArrayList<String> S1 =null;
	private ArrayList< ArrayList<Car>> S2 = null;
    private ArrayList<ArrayList<Double>> S3 = null;
	private ArrayList<ArrayList<String>> S4 = null;
	private ArrayList<ArrayList<Fruit>> S5 = null;
	private ArrayList<ArrayList<Integer>> C1= null;
	private int mode=0;
	//
	private JComboBox trabox = null;
	private JComboBox frabox = null;
	//
	private  Image  img = null; 
	
	public  Animatepanel(){
		initialize2();
		this.setLayout(null);
	}
	
	
	public  Animatepanel(int m,ArrayList<String> s1,  ArrayList< ArrayList<Car>> s2, ArrayList< ArrayList<Double>> s3,ArrayList< ArrayList<String>>  s4,ArrayList< ArrayList<Fruit>> s5,ArrayList< ArrayList<Integer>> c1  ) { 
		
        mode=m;
        S1=new ArrayList<String>(s1);
        S2=new ArrayList<ArrayList<Car>>(s2);
        S3=new ArrayList<ArrayList<Double>>(s3);
        S4=new ArrayList<ArrayList<String>>(s4);
        S5=new ArrayList<ArrayList<Fruit>>(s5);
        C1=new ArrayList<ArrayList<Integer>>(c1);
		
		//System.out.println("s4 size"+s4.size());

			/*
          System.out.println("S4 size"+S4.size());
          for(int i=0; i<S4.size();i++)
            {
                 for(int j=0;j<S4.get(i).size();j++)
                   {
                       System.out.print(S4.get(i).get(j)+" ");
                       
                    }
                    System.out.println();
            }           
			*/
		this.setLayout(null);
		initialize();
    }
	
			
      public void initialize(){
      
            this.add(getStartBtn());
            this.add(getPauseBtn());
            this.add(getResumeBtn());
            this.add(getResetBtn());
			this.add(gettraBox());
			this.add(getfraBox());
			this.add(getJtra());
			this.add(getJfra());
			this.add(getJre());
	
			/*
             String aaa="uU uweh kfow ewq-qo dow- zcswe cxcdf yeede";  
              //  ArrayList<String>  aa= new ArrayList<String>();
             insertionSort b= new  insertionSort();
                 

			 b.AO_sort(  Seperate.Seperate_S(aaa),S1,S2,S3 );
			 stepsize=S3.size();
			 element=S3.get(0).size();
			 in=new ArrayList<String>(S2.get(0));
			 
			 for(int i=0; i<S3.size();i++)
			 {
				 for(int j=0;j<S3.get(0).size();j++)
				 {
					System.out.print(S3.get(i).get(j)+" "); 
				 }
				 System.out.println();
			 }
			 
			 */
			 
			 switch(mode)
			{
				case 1:
					for(int i=0; i<S3.get(0).size();i++)
					{
						BigDecimal bigDecimal = new BigDecimal(S3.get(0).get(i));
						in.add( bigDecimal.toString() );
						if( in.get(i).length() >11) in.set(i,  in.get(i).substring(0,9)+"...");						
					}
                break;
                case 2:
						in=new ArrayList<String>(S4.get(0));
                break;
                case 3:
					for(int i=0; i<S2.get(0).size();i++)
					{
						in.add(String.valueOf(S2.get(0).get(i).getn()) );
					}
                break;
                case 4:
					for(int i=0; i<S5.get(0).size();i++)
					{
						in.add(String.valueOf(S5.get(0).get(i).getn()) );
					}
                break;
            }
			 
			 if(C1.size()>0)
			 {
			 stepsize=C1.size();
			 element=C1.get(0).size();
             System.out.println("stepsiz: "+stepsize);   
             System.out.println("element: "+element);
             }
			 setxy();
			 img=getToolkit().getImage("./img/bg4.jpg");
             timer=new Timer(150,this);
    }
	
	  public void initialize2(){
            this.add(getStartBtn());
            this.add(getPauseBtn());
            this.add(getResumeBtn());
            this.add(getResetBtn());
			this.add(gettraBox());
			this.add(getfraBox());
			this.add(getJre());
    }


//	getStartBtn
    private JButton getStartBtn() {
        if (startBtn == null) {
            startBtn = new JButton();
            startBtn.setBounds(new Rectangle(50, 50, 125, 25)); 
            startBtn.setText("start");
            startBtn.setFont(new Font("",Font.PLAIN,15));
            startBtn.setForeground(word);
            startBtn.setBackground(btn);
            startBtn.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                       
                          timer.start();
                          startBtn.setEnabled(false);
                          resumeBtn.setEnabled(true);
                    }
                }
            );
        }
        return startBtn;
    }

    public void actionPerformed(ActionEvent e){
     
        if (e.getSource() == timer)
         {
			   System.out.println("***************jello********************");
			 if(tj<stepsize-1 && tl==1)
			 {
				 
				 for(int i=0; i<element ;i++)
				 {
	              d.set(i,0);
   	             }
	 
				 for(int i=0;i<element;i++)
				 {
					 int q=C1.get(tj+1).get(i)-C1.get(tj).get(i);
					 System.out.println("q"+q);
					 d.set(i,q);
					 System.out.println("d"+d);
				 }
			 }
			 if(tl==1)
			 {
				X_reset = new ArrayList<Float>(X);
				Y_reset = new ArrayList<Float>(Y);
			 }
			 if(tl>=1)
			 {
				 
				 for(int k=0; k<element ;k++)
				 {
					//upcircle(X,Y,d,k);
					switch(tra_selection)
					{
						case 0:
					    trj.tra(X,Y,d,k,tl);
						break;
						case 1:
						trj2.tra(X,Y,d,k,tl);
						break;
						case 2:
					    trj3.tra(X,Y,d,k,tl);
						break;
						case 3:
						trj4.tra(X,Y,d,k,tl);
						break;
						case 4:
						trj5.tra(X,Y,d,k,tl);
						break;
						case 5:
						trj6.tra(X,Y,d,k,tl);
						break;
						case 6:
						trj7.tra(X,Y,d,k,tl);
						break;
						case 7:
						trj8.tra(X,Y,d,k,tl);
						break;
					    case 8:
						trj9.tra(X,Y,d,k,tl);
						break;
						default:
						trj.tra(X,Y,d,k,tl);
					}
				 }
				 repaint();
			 }
			
			 tl++;
			 if(tl==11)
			 {	 
		        X_reset = new ArrayList<Float>(X);
				Y_reset = new ArrayList<Float>(Y);
		        tl=1;
				tj++;
				
			 }
			 System.out.println("tl"+tl+"tj"+tj);
			 if(tj==stepsize-1) timer.stop();			 
         } 
    }
	

	
	 public void paintComponent(Graphics g) {
	
		 super.paintComponent(g);
		 Dimension d =getSize();
		 AffineTransform at = new AffineTransform();
		// double sc= Math.min( d.width/(double)img.getWidth(null),d.height/(double)img.getHeight(null)  );
		 at.scale(d.width/(double)img.getWidth(null),d.height/(double)img.getHeight(null));
		 Graphics2D g2 = (Graphics2D) g;
		 g2.drawImage(img,at,this);
		 drawstr(g);
	}
	
	public void drawstr(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		for(int i=0;i<element;i++)
		{
				g2.setColor(Color.BLACK);
				g2.setFont(new Font(null,Font.BOLD,15));
                			
				if(mode==1)
				{
					g2.drawString("Number",X.get(i)+20,Y.get(i));
				}
				else if(mode==2)
				{
					g2.drawString("String",X.get(i)+20,Y.get(i));
				}
				else if(mode==3)
				{
					g2.drawString("Car",X.get(i)+20,Y.get(i));
				}		
				else if(mode==4)
				{
					g2.drawString("Fruit",X.get(i)+20,Y.get(i));
				}
				
				if(mode==1)
				{
					String s=in.get(i).replaceAll("[.]0+?$","");
					//s=s.replaceAll("[.]$","");
					in.set(i,s);
				}
				
				if( in.get(i).length() >11)
				{
					in.set(i,  in.get(i).substring(0,9)+"...");
					g2.setColor(Color.BLUE);	
				}
				else
				{
					g2.setColor(Color.BLACK);	
				}
				
				g2.drawString(in.get(i),X.get(i),Y.get(i)+30);
				
				if(d.get(i) != 0)
				{
					g2.setColor(Color.RED);
				}
				else
				{
					g2.setColor(Color.BLACK);
				}
				
				
				switch(fra_selection)
				{
					case 0:
					f1.drawf(g,i,X,Y);
					break;
					case 1:
					f2.drawf(g,i,X,Y);
					break;
					case 2:
					f3.drawf(g,i,X,Y);
					break;
					default:
					f1.drawf(g,i,X,Y);
				}
		}
	}
	

  private JButton getResumeBtn() {
        if (resumeBtn == null) {
            resumeBtn = new JButton();
            resumeBtn.setBounds(new Rectangle(50, 100, 125, 25)); 
            resumeBtn.setText("resume");
            resumeBtn.setFont(new Font("",Font.PLAIN,15));
            resumeBtn.setForeground(word);
            resumeBtn.setBackground(btn);
            resumeBtn.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                       timer.start();
					}                                          
                }
            );
        
                    }
        return resumeBtn;
    }



 private JButton getPauseBtn() {
        if (pauseBtn == null) {
            pauseBtn = new JButton();
            pauseBtn.setBounds(new Rectangle(50, 75, 125, 25)); 
            pauseBtn.setText("pause");
            pauseBtn.setFont(new Font("",Font.PLAIN,15));
            pauseBtn.setForeground(word);
            pauseBtn.setBackground(btn);
            pauseBtn.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {                    
                        timer.stop();
                       
                    }
                }
            );
        }
        return pauseBtn;
    }

	private JButton getResetBtn() {
        if (resetBtn == null) {
            resetBtn = new JButton();
            resetBtn.setBounds(new Rectangle(50, 125, 125, 25)); 
            resetBtn.setText("reset");
            resetBtn.setFont(new Font("",Font.PLAIN,15));
            resetBtn.setForeground(word);
            resetBtn.setBackground(btn);
            resetBtn.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
						 timer.stop();
						 tj=0;
						 tl=1;
						 resetxy();
						 repaint();
                         startBtn.setEnabled(true);
                         resumeBtn.setEnabled(false);
              
                    }
                }
            );
        }
        return resetBtn;
    }
//trajectory
	private JComboBox gettraBox(){
		
		if(trabox ==null)
		{
			trabox = new JComboBox();
			trabox.addItem("upcircle");
			trabox.addItem("downcircle");
			trabox.addItem("upsquare");
			trabox.addItem("downsquare");
			trabox.addItem("upoval");
			trabox.addItem("downoval");
			trabox.addItem("directmove");
			trabox.addItem("uptri");
			trabox.addItem("downtri");
			trabox.setBounds(175, 50, 125, 25);
			trabox.setVisible(true);
			trabox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
				 String traMethod = (String)trabox.getSelectedItem();//get the selected item
				switch (traMethod) {
					case "upcircle":
						System.out.println("uc");
						tra_selection=0;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;
					case "downcircle":
					    System.out.println("dc");
						tra_selection=1;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;
					case "upsquare":
						 System.out.println("us");
						tra_selection=2;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;
					case "downsquare":
					    System.out.println("ds");
						tra_selection=3;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;	
					case "upoval":
					    System.out.println("ds");
						tra_selection=4;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;		
					case "downoval":
					    System.out.println("ds");
						tra_selection=5;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;		
					case "directmove":
					    System.out.println("ds");
						tra_selection=6;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;		
					case "uptri":
					    System.out.println("ds");
						tra_selection=7;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;	
					case "downtri":
					    System.out.println("ds");
						tra_selection=8;
						if(tl>=2)
						{
						for(int i=0 ; i <element ;i++)
						{
							X.set(i,X_reset.get(i));
							Y.set(i,Y_reset.get(i));
							repaint();
						}
						}
						tl=1;
						break;		
						
				}
			}
		});
		
		}
		return trabox;
	}
	
	public JLabel getJtra()
	{
		if(Jtra == null)
		{
			Jtra= new JLabel("trajectory" , SwingConstants.CENTER);
			Jtra.setBounds(175,25,125,25);
			Jtra.setFont(new Font(null,Font.BOLD,16));
			Jtra.setFocusable(false);
		}
		return Jtra;
	}
//frame
	private JComboBox getfraBox(){
		
		if(frabox ==null)
		{
			frabox = new JComboBox();
			frabox.addItem("oval");
			frabox.addItem("rectangle");
			frabox.addItem("roundrectangle");
			frabox.setBounds(300, 50, 125, 25);
			frabox.setVisible(true);
			frabox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
				 String fraMethod = (String)frabox.getSelectedItem();//get the selected item
				switch (fraMethod) {
					case "oval":
						System.out.println("oval");
						fra_selection=0;
						repaint();
						break;
					case "rectangle":
					    System.out.println("rect");
						fra_selection=1;
						repaint();
						break;
					case "roundrectangle":
						System.out.println("rrect");
						fra_selection=2;
						repaint();
						break;
					
				}
			}
		});
		
		}
		return frabox;
	}
	public JLabel getJfra()
	{
		if(Jfra == null)
		{
			Jfra= new JLabel("frame type" , SwingConstants.CENTER);
			Jfra.setBounds(300,25,125,25);
			Jfra.setFont(new Font(null,Font.BOLD,16));
			Jfra.setFocusable(false);
		}
		return Jfra;
	}
	
////
	public JLabel getJre()
	{
		if(Jre == null)
		{
			Jre= new JLabel("Animate function" , SwingConstants.CENTER);
			Jre.setBounds(0,25,175,25);
			Jre.setFont(new Font(null,Font.BOLD,16));
			Jre.setFocusable(false);
		}
		return Jre;
	}

  public void setxy()
  {
	  for(int i=0; i<element ;i++)
	  {
		 X.add(Float.valueOf(String.valueOf(x_start+x_l*i)));  
		 Y.add(Float.valueOf(String.valueOf(y_start)));  
	     d.add(0);
   	 }
	 
	  this.setPreferredSize(new Dimension(x_start+x_l*element, 400));
	 
  }
  
  public void resetxy()
  {
	  for(int i=0; i<element ;i++)
	  {
		 X.set(i,Float.valueOf(String.valueOf(x_start+x_l*i)));  
		 Y.set(i,Float.valueOf(String.valueOf(y_start)));  
		 X_reset.set(i,Float.valueOf(String.valueOf(x_start+x_l*i)));
		 Y_reset.set(i,Float.valueOf(String.valueOf(y_start)));  
	     d.set(i,0);
   	 }
	 
  }

	}