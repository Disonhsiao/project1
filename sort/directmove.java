import java.util.*;

public class directmove extends trajectory{
	public void tra(ArrayList<Float> X, ArrayList<Float> Y, ArrayList<Integer> d,int k,int tl)
	{
		X.set(k,X.get(k)+ Float.valueOf(String.valueOf(d.get(k)*le/t_sect))); 
		Y.set(k,Float.valueOf(String.valueOf(yp))); 
	}	
}	