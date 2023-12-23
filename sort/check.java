import java.util.*;
import java.lang.*;



public class check {
	
	public static void main(String[] args){
		String a="-12 25.5 25.58 -0.285 -1.25 0.285 58  .85";
		boolean result=stringCheck(a);
		System.out.println(result);
	}
	
	public static boolean stringCheck(String in_strng){
		String[] splitedArray = in_strng.trim().split(" +");
		
		for(int i=0 ; i<splitedArray.length;i++ ) {
			if(  ! isNumericc(splitedArray[i]) ) {
			   return false;
			}
		}
		return true;
	}
	
	
	public static boolean isNumericc(String str){
		int point_count=0; 
		for(int i=0;i<str.length();i++) {
  
			if(i==0  )
			 {
                if(str.charAt(i)=='+'||str.charAt(i)=='-')
                {
                    if( str.charAt(i+1)=='.'  )return false;
                	continue;
                }
                else if(str.charAt(i)=='.')
                {   
                	return false;
                }	
			 }
             
           if(i != 0)
           {
        	   if(str.charAt(i)=='.')
               {
               	 point_count++;
               }
        	   
        	   if(point_count==1&& str.charAt(i)=='.')
        	   {
        		   continue;
        	   }
        	   
        	   
        	   if(point_count>1)
        	   {
        		   System.out.println("point:"+point_count);
        		   return false;
        	   }
        	   
           }
          
			if( !Character.isDigit(str.charAt(i)) ) {
				return false;
			}
		}		 
		return true;
	}

    public static boolean isCar(String str){
		String[] sp = str.split(" +");
			
		if(  !(sp[0].equals("D")||sp[0].equals("S"))    )
         {
			 return false;
		 }



		for(int i=1 ; i<sp.length;i=i+4) {
		     if( i%4==1 )
                    {
                        if( !(sp[i].equals("aCar") ||sp[i].equals("bCar") ) ) return false; 
                 
				        if( sp[i].equals("aCar"))
					    {
                            if( !isNumericc(sp[i+2])  ) return false;
							if( !isNumericc(sp[i+3])  ) return false;
                        }
                        else if(sp[i].equals("bCar") )  
                        {
                             if( !isNumericc(sp[i+2])  ) return false;
                        }

                    }
		}
		return true;
	}

	 public static boolean isFruit(String str){
		String[] sp = str.split(" +");
			
		if(  !(sp[0].equals("D")||sp[0].equals("S"))    )
         {
			 return false;
		 }



		for(int i=1 ; i<sp.length;i=i+4) {
		     if( i%4==1 )
                    {
                        if( !(sp[i].equals("banana") ||sp[i].equals("apple") ) ) return false; 
                 
				        if( sp[i].equals("banana"))
					    {
                            if( !isNumericc(sp[i+2])  ) return false;
							if( !isNumericc(sp[i+3])  ) return false;
                        }
                        else if(sp[i].equals("apple") )  
                        {
                             if( !isNumericc(sp[i+2])  ) return false;
                        }

                    }
		}
		return true;
	}














}
