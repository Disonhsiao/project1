import java.util.*;
import java.awt.geom.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;

public class d_rec extends frame{
	public void drawf(Graphics g,int i,ArrayList<Float> X, ArrayList<Float> Y)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new   Rectangle2D.Double(  Double.valueOf(String.valueOf( X.get(i)))  ,   Double.valueOf(String.valueOf( Y.get(i)-20))               ,80,30));
	}	
}	