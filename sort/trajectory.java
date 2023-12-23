import java.util.*;

abstract class trajectory{
	public int le=80;//x_l
	public float yp=500;//y_staet
	public int t_sect=10;
	public int ts_s=3;
	public int ts_e=t_sect-ts_s+1;
	public int ts_m=t_sect-2*ts_s;
	abstract public void tra(ArrayList<Float> X, ArrayList<Float> Y, ArrayList<Integer> d,int k,int tl); 
}	