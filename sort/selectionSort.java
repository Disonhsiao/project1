import java.util.ArrayList;
import java.util.Arrays;

public class selectionSort extends sorting{

	
		
		
         public <T extends Comparable <T>>void AO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1)   {  
	    	
	    	int n = in.size();
	         T temp;
			 int inttemp;
			 ArrayList<Integer> origin = new ArrayList<Integer>();
			
			 
			 for(int i=0 ; i< n ;i++)
			 {
				 origin.add(i);	 
			 }
			 
			 //0618
			 ArrayList<Integer> aset = new ArrayList<Integer>();
			 for(int i=0 ; i< n ;i++)
			 {
				 aset.add(i);	 
			 }
			 int tempset;
			  ArrayList<Integer> clist = new ArrayList<Integer>();
			 for(int i=0 ; i< n ;i++)
			 {
				 clist.add(i);	 
			 }
			 //
			 
			 C1.add(new ArrayList<Integer>(origin));
			
	         String splitedArraytmp="";
             ArrayList<T> tB= new ArrayList<T>();
			 for(int k=0;k<n;k++) { 
					tB.add(in.get(k));   
						    }
			A1.add( "start" );
			B1.add(new ArrayList<T>(tB));

	         for(int i = 0; i < n-1; i++) {
	             int m = i;
	            for(int j = i + 1; j < n; j++){ 

				
                            if( in.get(j).compareTo(in.get(m)) <0  ) m=j;
	            
	             }
	             if(i != m){
	                 temp = in.get(i);
					 in.set(i,in.get(m));
                     in.set(m,temp);
					 
					 tempset=aset.get(i);
					 aset.set(i,aset.get(m));
                     aset.set(m,tempset);
					 
					
					 for(int g=0; g<n; g++)
					 {
						 for(int a=0; a<n ; a++)
						 {
							if( clist.get(g).compareTo(aset.get(a))==0 )
							{
									origin.set(g,a);
							}
						 }
					 }
					 
                     A1.add(  "element "+ i + " exchanges with element "+ m );
                     tB.clear();
                   		for(int k=0;k<n-1;k++) 
	 					{ 
							tB.add(in.get(k));   
	 					}
						    tB.add(in.get(n-1));
							B1.add(new ArrayList<T>(tB));
					
					C1.add(new ArrayList<Integer>(origin));
							
	             }
				
	      
	         }       
	    }  

         public <T extends Comparable <T>>void DO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	
	    	int n = in.size();
	         T temp;
			 int inttemp;
			 ArrayList<Integer> origin = new ArrayList<Integer>();
			 
			 for(int i=0 ; i< n ;i++)
			 {
				 origin.add(i);	 
			 }
			  //0618
			 ArrayList<Integer> aset = new ArrayList<Integer>();
			 for(int i=0 ; i< n ;i++)
			 {
				 aset.add(i);	 
			 }
			 int tempset;
			  ArrayList<Integer> clist = new ArrayList<Integer>();
			 for(int i=0 ; i< n ;i++)
			 {
				 clist.add(i);	 
			 }
			 //
			 
			 C1.add(new ArrayList<Integer>(origin));
	    	 
	         String splitedArraytmp="";
             ArrayList<T> tB= new ArrayList<T>();
			 for(int k=0;k<n;k++) { 
					tB.add(in.get(k));   
						    }
			A1.add(  "start" );
			B1.add(new ArrayList<T>(tB));

	         for(int i = 0; i < n-1; i++) {
	             int m = i;
	            for(int j = i + 1; j < n; j++){ 

                            if( in.get(j).compareTo(in.get(m)) >0  ) m=j;
	                 
	             }
	             if(i != m){
	                 temp = in.get(i);
					 in.set(i,in.get(m));
                     in.set(m,temp);
					
					 tempset=aset.get(i);
					 aset.set(i,aset.get(m));
                     aset.set(m,tempset);
					  for(int g=0; g<n; g++)
					 {
						 for(int a=0; a<n ; a++)
						 {
							if( clist.get(g).compareTo(aset.get(a))==0 )
							{
									origin.set(g,a);
							}
						 }
					 }
					 
                     A1.add(  "element "+ i + " exchanges with element "+ m );
                     tB.clear();
                   		for(int k=0;k<n-1;k++) 
	 					{ 
							tB.add(in.get(k));   
	 					}
						    tB.add(in.get(n-1));
							B1.add(new ArrayList<T>(tB));		
							
					C1.add(new ArrayList<Integer>(origin));
	             }
			
	      
	         }       
	    }  






		public static void main(String[] args) {
				selectionSort SS = new  selectionSort();   
		        String aaa="js eif ew a  cee 43sw edw";  
				//String bbb="1.25 3.68 0.285 5 9.8 7.2";
				//String ccc="S aCar aloha 2.85 3.85  aCar baloha 3.85 4.85  bCar valoha 6.85 9.85 ";

		        ArrayList<String> S1=new ArrayList<String>();
		        ArrayList<ArrayList<Integer>> S2=new ArrayList<ArrayList<Integer>>();
		        System.out.print("Final Result: ");    
		    	//ES.AS_sort(bbb,S1,S2);//sorting array using insertion sort
		        
                 /*//ArrayList<String> aaa=new  ArrayList<String>();
                 aaa.add("abc");
                 aaa.add("abdjudu");
                 aaa.add("hdi");
                 aaa.add("abcidis");
                 aaa.add("ABCgkoroo");*/

                 ArrayList< ArrayList<String>> S3=new ArrayList< ArrayList<String>>();
                 SS.AO_sort( Seperate.Seperate_S(aaa),S1,S3,S2);
            
		        
		        //for(int i=0;i<S2.size();i++)
		        //{		        	
		        //	System.out.println(S2.get(i));	
		        //}
		        
		    	System.out.println("****");
		        
				for(int i=0; i< S3.size();i++)
                 {
                   for(int j=0; j<S3.get(i).size() ;j++)
                   {
                     System.out.print(S3.get(i).get(j)+ " ");
                   }
                     System.out.println("\n");
                 }
                
				   for(int i=0; i<S1.size() ;i++)
                   {
                     System.out.print(S1.get(i)+ " ");
                   }
				   
				   System.out.println();
				   
				 for(int i=0; i< S2.size();i++)
                 {
                   for(int j=0; j<S2.get(i).size() ;j++)
                   {
                     System.out.print(S2.get(i).get(j)+ " ");
                   }
                     System.out.println("\n");
                 }



		    	        
		    } 
	 	 
}
