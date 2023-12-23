import java.util.*;

public class upcircle extends trajectory{
	public void tra(ArrayList<Float> X, ArrayList<Float> Y, ArrayList<Integer> d,int k,int tl)
	{
		float x_c=0;
		float radius =0;	 
		radius=d.get(k)*80/2;
		x_c=radius+X.get(k)-(tl-1)*Float.valueOf(String.valueOf(d.get(k)*80.0/10.0));
		//System.out.println("radius**********"+radius);
		//System.out.println("xcenter**********"+x_c);
		X.set(k,X.get(k)+ Float.valueOf(String.valueOf(d.get(k)*80.0/10.0))); 
		float yy=  Float.valueOf(  String.valueOf (         300-Math.sqrt(  Math.pow( radius,2)-Math.pow( X.get(k)-x_c,2 )  )                 ));
		Y.set(k,Float.valueOf(String.valueOf(yy))); 
		//System.out.println("yy**********"+yy);
		//System.out.println("x"+X.get(k));
		//System.out.println("y"+Y.get(k));
	}	
}	