import java.util.*;

public class bCar extends Car{
	
    public bCar(String n , double p, String b,int i)
    {
        name=n;
        price=p;
        brand=b;
         compareitem=i;
    }
    public bCar()
    {
        price=1.4;
        name="jungle";
        brand="alo";
        compareitem=1;

    }
    private String brand;

    public  String getb(){
        return brand;
    }
    public double getd(){
        return price;
    }
    public String getn(){
        return name;
    }


        
}	