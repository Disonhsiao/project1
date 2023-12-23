import java.util.*;
public class random extends Inputa{
	
	public static void main(String[] args) {
		System.out.println(N_random());
     }




public static String getCode(int n) {
		String string = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-*/<>?,";
		char[] ch = new char[n]; 
		for (int i = 0; i < n; i++) {
			Random random = new Random();
			int index = random.nextInt(string.length());
			ch[i] = string.charAt(index);
		}
		String result = String.valueOf(ch);
		return result;
	}

public static String S_random() {
int r = 0;
r = (int)(Math.random()*(20-2+1))+2;
String a="";
   for(int i=0 ;i <r ;i++)
   {
	int s= (int)(Math.random()*(10-2+1))+2;   
       
            a=a+ getCode(s)+" ";
   }
  return a;

}  




public static String N_random() {
int k = 0;
k = (int)(Math.random()*(20-2+1))+2;
String a="";
   for(int i=0 ; i <k ;i++)
   {

    int r = (int)(Math.random()*(2-1+1))+1;
      if(r==1)
	  {
        int s = (int)(Math.random()*(5000-1+1))+1;
          int j = (int)(Math.random()*(2-1+1))+1;
             if(j==2) s=s*(-1);
              a=a+String.valueOf(s)+" ";
	  }
	  else if(r==2)
	  {
         int integer = (int)(Math.random()*(5000-1+1))+1;
         int partial = (int)(Math.random()*(99999-1+1))+1;
		  int c = (int)(Math.random()*(2-1+1))+1;
       String de=String.valueOf(integer)+"."+partial;
	     if(c==2)  de="-"+de;
		a=a+de+" ";
	  }
   
   }

  return a;

}  


public static String C_random() {

int k = 0;
k = (int)(Math.random()*(20-2+1))+2;
String a="";
//ds
	int l = 0;
	l = (int)(Math.random()*(2-1+1))+1;
	String ds="";
	if(l==1)
	{
		ds="D";
	}
	else if(l==2)
	{
		ds="S";
	}
	a=a+ds;
	
for(int i=0;i<k;i++)
{
	
	//abCar
	int l2 = 0;
	l2 = (int)(Math.random()*(2-1))+1;
	String ab="";
	if(l2==1)
	{
		ab="aCar";
	}
	else if(l2==2)
	{
		ab="bCar";
	}
	//string
	String [] namelist={"Mazda","Nisan","Mini","Rover","Smart","Toyo","Volvo","Suzuk","Saturn","Porsch","Opel","Renaul"};
	int l3 = 0;
	l3 = (int)(Math.random()*(11-0));
	String name=namelist[l3]+getCode(2);
	//double
	int integer = (int)(Math.random()*(5000-1+1))+1;
    int partial = (int)(Math.random()*(99999-1+1))+1;
    String de=String.valueOf(integer)+"."+partial;
	//--------
	//weight
	int integer2 = (int)(Math.random()*(5000-1+1))+1;
    int partial2 = (int)(Math.random()*(99999-1+1))+1;
    String de2=String.valueOf(integer2)+"."+partial2;
	//string
	String brand=getCode(6);
	if(l2==1)
	{
		a=a+" "+ab+" "+name+" "+de+" "+de2;
	}
	else if(l2==2)
	{
		a=a+" "+ab+" "+name+" "+de+" "+brand;
	}
} 
  

  return a;

}  



public static String F_random() {

int k = 0;
k = (int)(Math.random()*(20-2+1))+2;
String a="";
//ds
	int l = 0;
	l = (int)(Math.random()*(2-1+1))+1;
	String ds="";
	if(l==1)
	{
		ds="D";
	}
	else if(l==2)
	{
		ds="S";
	}
	a=a+ds;
	
for(int i=0;i<k;i++)
{
	
	//abCar
	int l2 = 0;
	l2 = (int)(Math.random()*(2-1+1))+1;
	String ab="";
	if(l2==1)
	{
		ab="banana";
	}
	else if(l2==2)
	{
		ab="apple";
	}
	//string
	String [] namelist={"yellow","red","green","purple","orange","Pink","gray","blue","brown","Skin","Yellow","Red"};
	int l4 = 0;
	l4 = (int)(Math.random()*(11-0+1));
	String [] degree={"dark-","light-","dim-","Bright-"};
	int l5 = 0;
	l5 = (int)(Math.random()*(3-0+1));
	
	String color=degree[l5]+namelist[l4]+getCode(2);
	//double
	int integer = (int)(Math.random()*(5000-1+1))+1;
    int partial = (int)(Math.random()*(99999-1+1))+1;
    String de=String.valueOf(integer)+"."+partial;
	//--------
	//weight
	int integer2 = (int)(Math.random()*(5000-1+1))+1;
    int partial2 = (int)(Math.random()*(99999-1+1))+1;
    String de2=String.valueOf(integer2)+"."+partial2;
	//string
	String brand=getCode(6);
	if(l2==1)
	{
		a=a+" "+ab+" "+color+" "+de+" "+de2;
	}
	else if(l2==2)
	{
		a=a+" "+ab+" "+color+" "+de+" "+brand;
	}
} 
  

  return a;

}  




public String get_text(boolean N, boolean S){

                   if(N)
					{	
					   return  N_random();
					}

                    else if(S)
					{
						return S_random();
					}
					else
					{
						return S_random();
					}
            
}


}











	