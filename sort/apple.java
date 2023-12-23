import java.util.*;

public class apple extends Fruit{
	
    public apple(String c , double w, String s, int i )
    {
        color=c;
        weight=w;
        season=s;
         compareitem=i;
    }
    public apple()
    {
        color="Red";
        weight=3.5;
        season="Spring";
        compareitem=1;
    }
    private String season;

    public  String gets(){
        return season;
    }
    public double getd(){
        return weight ;
    }
    public String getn(){
        return color;
    }


        
}	