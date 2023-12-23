import java.util.ArrayList;
import java.util.Arrays;

public class quickSort extends sorting{

		private static  <T extends Comparable <T>>void sort(ArrayList<T> in,ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1,int left ,int right,boolean mode,ArrayList<Integer> clist, ArrayList<Integer> origin, ArrayList<Integer> aset){//mode 1:up,mode 0:down
			if(left < right) { 
/*
				if(mode){
					int q = partition(in,A1,B1, left, right,true); 
					sort(in,A1,B1, left, q-1,true); 
					sort(in,A1,B1, q+1, right,true); 
				}
				else{
					int q = partition(in,A1,B1, left, right,false); 
					sort(in,A1,B1, left, q-1,false); 
					sort(in,A1,B1, q+1, right,false); 
				}
*/
					int q = partition(in,A1,B1,C1, left, right,mode,clist,origin,aset); 
					sort(in,A1,B1,C1, left, q-1,mode,clist,origin,aset); 
					sort(in,A1,B1,C1, q+1, right,mode,clist,origin,aset); 
			} 
		}	

		private static  <T extends Comparable <T>>int partition(ArrayList<T> in,ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1,int left ,int right,boolean mode,ArrayList<Integer> clist, ArrayList<Integer> origin,ArrayList<Integer> aset){
			int i = left - 1; 
    		for(int j = left; j < right; j++) { 
            	if( in.get(j).compareTo( in.get(right) ) <=0 && mode){
					i++; 
                	swap(in,A1,B1,C1, i, j,clist,origin,aset); 
				}
				else if( in.get(j).compareTo( in.get(right) ) >=0 && !mode){
					i++; 
					swap(in,A1,B1,C1, i, j,clist,origin,aset); 
				}

			}
			//System.out.println(i);
        	swap(in, A1, B1,C1, i+1, right,clist,origin,aset); 
        	return i+1; 
		}

		private static  <T extends Comparable <T>>void swap(ArrayList<T> in,ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1,int i ,int j,ArrayList<Integer> clist, ArrayList<Integer> origin,ArrayList<Integer> aset){

			T temp;
			int tmpkey;
			//System.out.println(i+" "+j);
			temp = in.get(i);
			tmpkey= aset.get(i);
			//System.out.println(temp+" "+in.get(j));
			in.set(i,in.get(j));
			aset.set(i,aset.get(j));
			in.set(j,temp);
			aset.set(j,tmpkey);
			//4
			if(i!=j)
			{
			int n = in.size();
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
			ArrayList<T> tB= new ArrayList<T>();
			tB.clear();
            for(int l=0;l<in.size();l++) 
	 		{ 
				tB.add(in.get(l));   
	 		}
			A1.add(  "element "+ i + " exchanges with element "+ j );
			B1.add(new ArrayList<T>(tB) );
			}
		}


         public <T extends Comparable <T>>void AO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	
	    	int n = in.size();
			ArrayList<T> tB= new ArrayList<T>();
			for(int k=0;k<n;k++) { 
				tB.add(in.get(k));   
								}
			A1.add(  "start" );
			B1.add(new ArrayList<T>(tB));
			//System.out.println("0123");
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
			 //
			sort(in,A1,B1,C1, 0, n-1,true,clist,origin,aset);
	        
	      
	    }

		

         public <T extends Comparable <T>>void DO_sort(ArrayList<T> in, ArrayList<String> A1, ArrayList<ArrayList<T>> B1,ArrayList<ArrayList<Integer>> C1) {  
	    	
	    	int n = in.size();
			ArrayList<T> tB= new ArrayList<T>();
			for(int k=0;k<n;k++) { 
				tB.add(in.get(k));   
								}
			A1.add(  "start" );
			B1.add(new ArrayList<T>(tB));
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
			 //
			
			sort(in,A1,B1, C1,0, n-1,false,clist,origin,aset);
			
	    }  






		public static void main(String[] args) {
			quickSort ES = new  quickSort();   
			String aaa="aajhjr ejhfjfew hj orew a jfj   rjfkigj js aajasju j";  
			//String bbb="1.25 3.68 0.285 5 9.8 7.2";
			//String ccc="S aCar aloha 2.85 3.85  aCar baloha 3.85 4.85  bCar valoha 6.85 9.85 ";

			ArrayList<String> S1=new ArrayList<String>();

			System.out.print("Final Result: \n\n");    
			 ArrayList< ArrayList<Integer>> S2=new ArrayList< ArrayList<Integer>>();
			 ArrayList< ArrayList<String>> S3=new ArrayList< ArrayList<String>>();
			 ES.AO_sort( Seperate.Seperate_S(aaa),S1,S3,S2); //s //n //c //f
			

			 //output

			
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
