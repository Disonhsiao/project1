import java.util.ArrayList;
import java.util.Arrays;

public class bubbleSort extends sorting{

	
		
		
         public <T extends Comparable <T>>void AO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	
	    	int n = in.size();
	         T temp;
			 //4
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
			 //
	         String splitedArraytmp="";
             ArrayList<T> tB= new ArrayList<T>();


			 tB.clear();
			
			for(int k=0;k<n;k++) { 
					tB.add(in.get(k));   
						    }
			A1.add(  "start" );
			B1.add(new ArrayList<T>(tB));

			
			for(int i = 0;i < n ;i++) {
				for(int j =  0;j < n-i-1;j++) {
					if( in.get(j).compareTo(in.get(j+1)) >0  ){

					
						temp = in.get(j);
						in.set(j,in.get(j+1));
						in.set(j+1,temp);
						
						tempset=aset.get(j);
					    aset.set(j,aset.get(j+1));
                        aset.set(j+1,tempset);
						
						//4	
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
						//
						
						A1.add(  "element "+ j + " exchanges with element "+ j+1 );
						
						tB.clear();
						for(int k=0;k<n;k++) { 
								tB.add(in.get(k));   
						}
						B1.add(new ArrayList<T>(tB));
						//4
						C1.add(new ArrayList<Integer>(origin));
						//
					}
						
				}
			}       
	    }

         public <T extends Comparable <T>>void DO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	
	    	int n = in.size();
	         T temp;
			 //4
			 ArrayList<Integer> origin = new ArrayList<Integer>();
			 for(int i=0 ; i< n ;i++)
			 {
				 origin.add(i);	 
			 }
			 C1.add(new ArrayList<Integer>(origin));
			 //
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
	    	
	         String splitedArraytmp="";
             ArrayList<T> tB= new ArrayList<T>();

			  tB.clear();
			
			for(int k=0;k<n;k++) { 
					tB.add(in.get(k));   
						    }
			A1.add(  "start" );
			B1.add(new ArrayList<T>(tB));



	         for(int i = 0;i < n ;i++) {
				for(int j =  0;j < n-i-1;j++) {
					if( in.get(j).compareTo(in.get(j+1)) <0  ){

					
						temp = in.get(j);
						in.set(j,in.get(j+1));
						in.set(j+1,temp);
						
						
						tempset=aset.get(j);
					    aset.set(j,aset.get(j+1));
                        aset.set(j+1,tempset);
						
						//4	
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
						//
						
						A1.add(  "element "+ j + " exchanges with element "+ j+1 );
						
						tB.clear();
						for(int k=0;k<n;k++) { 
								tB.add(in.get(k));   
						}

						B1.add(new ArrayList<T>(tB));
						//4
						C1.add(new ArrayList<Integer>(origin));
						//
					}
				}
			}       
	    }  






		public static void main(String[] args) {
			bubbleSort ES = new  bubbleSort();   
			//String aaa="aajhjr ejhfjfew hj orew a jfj   rjfkigj js aajasju j";  
			String bbb="1.25 3.68 0.285 5 9.8 7.2";
			//String ccc="S aCar aloha 2.85 3.85  aCar baloha 3.85 4.85  bCar valoha 6.85 9.85 ";

			ArrayList<String> S1=new ArrayList<String>();

			System.out.print("Final Result: ");    
			 ArrayList< ArrayList<Integer>> S2=new ArrayList< ArrayList<Integer>>();
			 ArrayList< ArrayList<Double>> S3=new ArrayList< ArrayList<Double>>();
			 ES.AO_sort( Seperate.Seperate_N(bbb),S1,S3,S2); //s //n //c //f
			

			 //output
			System.out.println("****");
			
			for(int i=0; i< S3.size();i++)
			 {
			   for(int j=0; j<S3.get(i).size() ;j++)
			   {
				 System.out.print(S3.get(i).get(j)+ " ");
			   }
				 System.out.println("\n");
			 }
			//output
					
                
		    	        
		    } 
	 	 
}
