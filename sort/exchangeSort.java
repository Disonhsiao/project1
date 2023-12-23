import java.util.*;


public class exchangeSort extends sorting{
	
	
	
         public <T extends Comparable <T>>void AO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	//String[] array=Separate_S.parseString(inputString);
	    
	    	int n = in.size();
	
	         T temp;
	         String splitedArraytmp="";
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
			 
	         ArrayList<T> tB= new ArrayList<T>();
	          tB.clear();
			  for(int k=0;k<n;k++) { 
					tB.add(in.get(k));   
						    }
			A1.add(  "start" );
			B1.add(new ArrayList<T>(tB));

	    	for(int i = 0,count = 1;i < n - 1;i++) {
				for(int j = i + 1;j < n;j++,count++) {
					boolean isChange =false;//is used to output 
					if(in.get(i).compareTo(in.get(j)) >0 ) {
						  temp = in.get(i);
						  in.set(i, in.get(j) );
						  in.set(j,temp);
						  
						  tempset=aset.get(i);
					      aset.set(i,aset.get(j));
                          aset.set(j,tempset);
						  
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
							C1.add(new ArrayList<Integer>(origin));
						//
						  isChange=true;		
						  A1.add("element "+i+" exchanges with elemnet "+j);		
	                      tB.clear();
					      for(int k=0;k<n-1;k++) 
				          { 
                            tB.add(in.get(k));
				          }	
                          tB.add(in.get(n-1));
						  B1.add(new ArrayList<T>(tB));
						}
					
				}
			
			}	     
	    }  

            public <T extends Comparable <T>>void DO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	
	    
	    	int n = in.size();
	
	         T temp;
	         String splitedArraytmp="";
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
		    
	         ArrayList<T> tB= new ArrayList<T>();
	          tB.clear();
			  for(int k=0;k<n;k++) { 
					tB.add(in.get(k));   
						    }
			A1.add(  "start" );
			B1.add(new ArrayList<T>(tB));

	    	for(int i = 0,count = 1;i < n - 1;i++) {
				for(int j = i + 1;j < n;j++,count++) {
					boolean isChange =false;
					if(in.get(i).compareTo(in.get(j)) <0 ) {
						  temp = in.get(i);
						  in.set(i, in.get(j) );
						  in.set(j,temp);
						  
						  tempset=aset.get(i);
					      aset.set(i,aset.get(j));
                          aset.set(j,tempset);
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
							C1.add(new ArrayList<Integer>(origin));
						//
						  isChange=true;		
						  A1.add("element "+i+" exchanges with elemnet "+j);		
	                      tB.clear();
					      for(int k=0;k<n-1;k++) 
				          { 
                            tB.add(in.get(k));
				          }	
                          tB.add(in.get(n-1));
						  B1.add(new ArrayList<T>(tB));
						}					
				}
			}	     
	    }  



		public static void main(String[] args) {
			exchangeSort ES = new  exchangeSort();   
			//String aaa="aajhjr ejhfjfew hj orew a jfj   rjfkigj js aajasju j";  
			String bbb="1.25 3.68 0.285 5 9.8 7.2";
			//String ccc="S aCar aloha 2.85 3.85  aCar baloha 3.85 4.85  bCar valoha 6.85 9.85 ";

			ArrayList<String> S1=new ArrayList<String>();

			System.out.print("Final Result: ");    

			 ArrayList< ArrayList<Double>> S3=new ArrayList< ArrayList<Double>>();
			 ArrayList< ArrayList<Integer>> S2=new ArrayList< ArrayList<Integer>>();
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
