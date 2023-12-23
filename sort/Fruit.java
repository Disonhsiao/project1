import java.util.*;

abstract class Fruit implements Comparable<Fruit>{
	String  color;
    double weight;
    int compareitem;

    public abstract String getn();
    public abstract double getd();


     @Override
    public int compareTo(Fruit fruit) {
        if(this.compareitem==1) 
        return this.color.compareTo(fruit.color);
        else if(this.compareitem==2)
        {
             if(this.weight-fruit.weight>0)
              return 1;
             else if(this.weight-fruit.weight < 0)
             return -1;
             else 
             return 0; 
        }
        else 
        return this.color.compareTo(fruit.color);
    }

}	