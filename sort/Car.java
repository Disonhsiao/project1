import java.util.*;

abstract class Car implements Comparable<Car>{
	String  name;
    double price;
    int compareitem;

    public abstract String getn();
    public abstract double getd();

    @Override
    public int compareTo(Car car) {
        if(this.compareitem==1) 
        return this.name.compareTo(car.name);
        else if(this.compareitem==2)
        {
             if(this.price-car.price>0)
              return 1;
             else if(this.price-car.price < 0)
             return -1;
             else 
             return 0; 
        }
        else 
        return this.name.compareTo(car.name);
    }

}	