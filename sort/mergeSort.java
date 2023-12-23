import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort extends sorting{

	
		
		
         public <T extends Comparable <T>>void AO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	
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
	
			  ArrayList<Integer> clist = new ArrayList<Integer>();
			 for(int i=0 ; i< n ;i++)
			 {
				 clist.add(i);	 
			 }
			 
			 ArrayList<Integer> tbint = new ArrayList<Integer>();
			 //
			 
			 
	         String splitedArraytmp="";

             ArrayList<T> tB= new ArrayList<T>();
			 for(int k=0;k<n;k++) 
			 { 
				tB.add(in.get(k));   
				tbint.add(k);
			 }
			 int mt=1;
			 A1.add("merge phase"+mt);
             B1.add(new ArrayList<T>(tB));

			 int rght, wid, rend;
			 int i,j,m,t;

	         for(int k = 1; k < n; k*=2) {
	            for(int left = 0  ; left+k < n; left+=k*2){ 

					rght = left + k;        
					rend = rght + k;
					if (rend > n) 
						rend = n; 

					m = left; i = left; j = rght; 
					while (i < rght && j < rend) { 
						if ( in.get(i).compareTo( in.get(j) )<=0 ) {         
							tB.set(m,in.get(i));
							tbint.set(m,aset.get(i));
							i++;
						} else {
							tB.set(m,in.get(j)); 
							tbint.set(m,aset.get(j));
							j++;
						}
						m++;
					}
					while (i < rght) { 
						tB.set(m,in.get(i));
						tbint.set(m,aset.get(i));
						i++; m++;
					}
					while (j < rend) { 
						tB.set(m,in.get(j));
						tbint.set(m,aset.get(j));
						j++; m++;
					}
					
					for (m=left; m < rend; m++) { 
						in.set(m,tB.get(m)); 
						aset.set(m,tbint.get(m));
					}
					tB.clear();
					tbint.clear();
                   	for(int l=0;l<n;l++) 
	 				{ 
						tB.add(in.get(l));   
						tbint.add(aset.get(l));
	 				}
					//4
					boolean check=false;
					int B1size=B1.size();
					for(int ll=0;ll<B1.get(0).size();ll++)
					{
					    if(tB.get(ll).compareTo(B1.get(B1size-1).get(ll)) !=0)	
						check=true;
					}
					
					if(check==true)
					{
						B1.add(new ArrayList<T>(tB));
					    mt+=1;
						A1.add("merge phase"+mt);
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
	
			  ArrayList<Integer> clist = new ArrayList<Integer>();
			 for(int i=0 ; i< n ;i++)
			 {
				 clist.add(i);	 
			 }
			 
			 ArrayList<Integer> tbint = new ArrayList<Integer>();
			 //
	    	 
	         String splitedArraytmp="";

             ArrayList<T> tB= new ArrayList<T>();
			 for(int k=0;k<n;k++) 
			 { 
				tB.add(in.get(k));   
				tbint.add(k);
			 }
			 int mt=1;
			 A1.add("merge phase"+mt);
			 B1.add(new ArrayList<T>(tB));


			 int rght, wid, rend;
			 int i,j,m,t;

	         for(int k = 1; k < n; k*=2) {
	            for(int left = 0  ; left+k < n; left+=k*2){ 

					rght = left + k;        
					rend = rght + k;
					if (rend > n) 
						rend = n; 

					m = left; i = left; j = rght; 
					while (i < rght && j < rend) { 
						if ( in.get(i).compareTo( in.get(j) )>=0 ) {         
							tB.set(m,in.get(i));
							tbint.set(m,aset.get(i));
							i++;
						} else {
							tB.set(m,in.get(j)); 
							tbint.set(m,aset.get(j));
							j++;
						}
						m++;
					}
					while (i < rght) { 
						tB.set(m,in.get(i));
						tbint.set(m,aset.get(i));
						i++; m++;
					}
					while (j < rend) { 
						tB.set(m,in.get(j)); 
						tbint.set(m,aset.get(j));
						j++; m++;
					}

					for (m=left; m < rend; m++) { 
						in.set(m,tB.get(m)); 
						aset.set(m,tbint.get(m));
					}
					tB.clear();
					tbint.clear();
					
                   	for(int l=0;l<n;l++) 
	 				{ 
						tB.add(in.get(l));
         				tbint.add(aset.get(l));	
	 				}
					//4
					boolean check=false;
					int B1size=B1.size();
					for(int ll=0;ll<B1.get(0).size();ll++)
					{
					    if(tB.get(ll).compareTo(B1.get(B1size-1).get(ll)) !=0)	
						check=true;
					}
					
					if(check==true)
					{
						B1.add(new ArrayList<T>(tB));
					    mt+=1;
						A1.add("merge phase"+mt);
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
					}


				}
				
	         }        

	    }  






		public static void main(String[] args) {
			mergeSort ES = new  mergeSort();   

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
