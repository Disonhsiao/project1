import java.util.*;

public class aCar extends Car{
	
    public aCar(String n , double p, double w,int i)
    {
        name=n;
        price=p;
        weight=w;
        compareitem=i;
    }
    public aCar()
    {
        price=1.4;
        weight=2.5;
        name="tsubaru";
        compareitem=1;

    }
    private double weight;


    public double getd(){
        return price;
    }
    public String getn(){
        return name;
    }
	
	public  double getw(){
        return weight;
    }

    public void compare( )
    {
               System.out.println("hello");
              


    }

        
}	