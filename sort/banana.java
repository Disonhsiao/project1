import java.util.*;

public class banana extends Fruit{
	
    public banana(String c , double w, double l,int i)
    {
        color=c;
        weight=w;
        length=l;
         compareitem=i;
    }
    public banana()
    {
        color="Red";
        weight=2.5;
        length=1.5;
        compareitem=1;
    }
    private double length;

    public  double getl(){
        return length;
    }
    public double getd(){
        return weight ;
    }
    public String getn(){
        return color;
    }


        
}	