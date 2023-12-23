import java.util.*;

public class upsquare extends trajectory{
	public void tra(ArrayList<Float> X, ArrayList<Float> Y, ArrayList<Integer> d,int k,int tl)
	{
			if( (tl<=ts_s) && (d.get(k) >0 || d.get(k)<0  )  ) 
            {
				float yy=  Float.valueOf(  String.valueOf ( Y.get(k)-25 ));
				Y.set(k,yy);
			}			
			else if(  (tl>=ts_e) && (d.get(k) >0 || d.get(k)<0  ) )
			{
				float yy=  Float.valueOf(  String.valueOf ( Y.get(k)+25 ));
				Y.set(k,yy);  	
			}
			else if( (tl>ts_s && tl <ts_e) && (d.get(k) >0 || d.get(k)<0  )  ) 
            {
				X.set(k,X.get(k)+ Float.valueOf(String.valueOf(d.get(k)*le/ts_m))); 
			}
					
	}	
}	