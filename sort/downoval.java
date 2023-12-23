import java.util.*;

public class downoval extends trajectory{
	public void tra(ArrayList<Float> X, ArrayList<Float> Y, ArrayList<Integer> d,int k,int tl)
	{
		float x_c=0;
		float x_radius =0;
		float y_radius =200;
		x_radius=d.get(k)*le/2;
		x_c=x_radius+X.get(k)-(tl-1)*Float.valueOf(String.valueOf(d.get(k)*le/t_sect));
		//System.out.println("radius**********"+x_radius);
		//System.out.println("xcenter**********"+x_c);
		X.set(k,X.get(k)+ Float.valueOf(String.valueOf(d.get(k)*le/t_sect))); 
		//float yy=  Float.valueOf(  String.valueOf (         yp ) );
		float yy=0;
		if(x_radius !=0)
		 yy=  Float.valueOf(  String.valueOf (         yp+Math.sqrt(    Math.pow(y_radius,2)-   Math.pow( (X.get(k)-x_c)*y_radius/x_radius,2 ) ) ));
		else 
		 yy=yp;
		Y.set(k,Float.valueOf(String.valueOf(yy))); 
		//System.out.println("yy**********"+yy);
		//System.out.println("x"+X.get(k));
		//System.out.println("y"+Y.get(k));
	}	
}	