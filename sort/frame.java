import java.util.*;
import java.awt.geom.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;

abstract class frame{
	public int y_shift=20;
	public int x_l=80;
	public int y_l=60;
	abstract public void drawf(Graphics g,int i,ArrayList<Float> X, ArrayList<Float> Y); 
}	