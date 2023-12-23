
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
// import javax.swing.border.Border;
// import javax.swing.BorderFactory;
// import javax.swing.SwingConstants;

import java.util.ArrayList;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;


public class aLabel extends JLabel {
		 private Image image;
		 public aLabel(Image image){
			 this.image = image;
		 }
		 @Override
		 public void paintComponent(Graphics g){
			 super.paintComponent(g);
			 int x = this.getWidth();
			 int y = this.getHeight();
 
			 g.drawImage(image, 0, 0, x, y, null);
		 }
	   }
