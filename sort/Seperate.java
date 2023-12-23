import java.util.*;
import java.lang.*;

public class Seperate {
		
	public static ArrayList<String> Seperate_S(String inputString) {
		String[] splitedArray = inputString.trim().split(" +");
        ArrayList<String> in=new  ArrayList<String>();
		  for(int i=0;i<splitedArray.length;i++)
          {
                    in.add(splitedArray[i]);
          }
          return in;
	}	
    public static ArrayList<Double> Seperate_N(String inputString) {
		String[] splitedArray = inputString.trim().split(" +");
		double[] numbers = new double[splitedArray.length];
		ArrayList<Double> in=new  ArrayList<Double>();
		for(int i=0; i < splitedArray.length; i++) {
		    numbers[i] = Double.parseDouble(splitedArray[i]);
		}

         for(int i=0;i<splitedArray.length;i++)
          {
                    in.add(numbers[i]);
          }
          return in;

	}	

    public static ArrayList<Car> Seperate_C(String inputString) {
		String[] sp = inputString.trim().split(" +");
		String choice= sp[0];
        ArrayList<Car> in=new  ArrayList<Car>();
        if(choice.equals("S"))
        {

            for(int i=1; i<sp.length ;i=i+4)
            {
                    if( i%4==1 )
                    {
                        if( sp[i].equals("aCar"))
                        {
                            System.out.println("aCar");
                            in.add(new aCar(sp[i+1], Double.valueOf(sp[i+2]) ,Double.valueOf(sp[i+3]),1 ));
                        }
                        else if(sp[i].equals("bCar") )  
                        {
                             in.add(new bCar(sp[i+1], Double.valueOf(sp[i+2]) ,sp[i+3],1 ));
                        }

                    }
            }
        }
        else if(choice.equals("D"))
        {
             for(int i=1; i<sp.length ;i=i+4)
            {
                    if( i%4==1 )
                    {
                        if( sp[i].equals("aCar"))
                        {
                            in.add(new aCar(sp[i+1], Double.parseDouble(sp[i+2]) ,Double.parseDouble(sp[i+3]),2 ));
                        }
                        else if(sp[i].equals("bCar"))   
                        {
                             in.add(new bCar(sp[i+1], Double.parseDouble(sp[i+2]) ,sp[i+3],2 ));
                        }

                    }
            }    
        }
        

         return in; 

	}	

    
     public static ArrayList<Fruit> Seperate_F(String inputString) {
		String[] sp = inputString.trim().split(" +");
		String choice= sp[0];
        ArrayList<Fruit> in=new  ArrayList<Fruit>();
        if(choice.equals("S"))
        {

            for(int i=1; i<sp.length ;i=i+4)
            {
                    if( i%4==1 )
                    {
                        if( sp[i].equals("banana"))
                        {
                            in.add(new banana(sp[i+1], Double.valueOf(sp[i+2]) ,Double.valueOf(sp[i+3]),1 ));
                        }
                        else if(sp[i].equals("apple") )  
                        {
                             in.add(new apple(sp[i+1], Double.valueOf(sp[i+2]) ,sp[i+3],1 ));
                        }

                    }
            }
        }
        else if(choice.equals("D"))
        {
             for(int i=1; i<sp.length ;i=i+4)
            {
                    if( i%4==1 )
                    {
                        if( sp[i].equals("banana"))
                        {
                            in.add(new banana(sp[i+1], Double.parseDouble(sp[i+2]) ,Double.parseDouble(sp[i+3]),2 ));
                        }
                        else if(sp[i].equals("apple"))   
                        {
                             in.add(new apple(sp[i+1], Double.parseDouble(sp[i+2]) ,sp[i+3],2 ));
                        }

                    }
            }    
        }
        

         return in; 

	}	




   



  
    public static void main(String[] args) {
	    /*
    	String inputString = "5 2 3 8 6";
		System.out.println(Arrays.toString(parseString(inputString)));
		*/
        String aaa="1.25 2.62 3.28 5.2862 4.852";  
        ArrayList<String> in=new  ArrayList<String>();
        //Seperate_N(aaa,in);

        System.out.println(in);
	}



}
