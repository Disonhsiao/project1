import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.geom.*;
import javax.swing.event.*;
import java.lang.*;



public class sortApp2 extends JFrame { 
    //sortApp sort1 = new sortApp();
//	insertionSort IS = new insertionSort();
	private  Animatepanel mp = null;
	private JScrollPane opaScrollPane = null;
   
    public sortApp2() { 
		super("win2");
		this.setSize(1000, 570);
		mp= new  Animatepanel();
		this.setContentPane(mp);
		this.setLocationRelativeTo(null);
		this.setTitle("Sort2");
		this.setVisible(true);
		
    }
  
    
    public sortApp2(int m,ArrayList<String> s1,  ArrayList< ArrayList<Car>> s2, ArrayList< ArrayList<Double>> s3,ArrayList< ArrayList<String>>  s4,ArrayList< ArrayList<Fruit>> s5,ArrayList<ArrayList<Integer>> c1) { 
		super("win2");
		initialize2(m,s1,s2,s3,s4,s5,c1);
    }

  			
    private void initialize2(int m,ArrayList<String> s1,  ArrayList< ArrayList<Car>> s2, ArrayList< ArrayList<Double>> s3,ArrayList< ArrayList<String>>  s4,ArrayList< ArrayList<Fruit>> s5,ArrayList<ArrayList<Integer>> c1) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(screenSize.width,screenSize.height);
		mp= new  Animatepanel(m,s1,s2,s3,s4,s5,c1);
		
		opaScrollPane = new JScrollPane(mp);
        opaScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		opaScrollPane.setBounds(new Rectangle(50, 50, 500, 500));

		this.setContentPane(opaScrollPane);
		this.setLocationRelativeTo(null);
		this.setTitle("Sort2");
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
				System.out.println("hello");
	 }
	
	
}
//Font f=new Font(null,Font.PLAIN,20);
//g.setFont(new Font("",Font.BOLD,10));    