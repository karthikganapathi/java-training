package JavaBasics;

public class IncrementalAndDecrimentalOrder {

	public static void main(String[] args) {
		// First i Value should be given to J ;
		//then the i value is incresed should be given to i ;
		int i=2;
		int j=i++; ///post incremental
		System.out.println(i);//3
		System.out.println(j);//2
		
		System.out.println("*********post decrimental**************");
		
		int k=2;
		int l=k--; // post decrimental
      
		System.out.println(k); //1
		System.out.println(l); //2
		
		
		
	    System.out.println("*********Pre decrimental**********");
	    
	    //Note:-->for pre decrimental/Incremental the values should be the same
	    
	    int m=4;
	    int n=--m; //for pre decrimental 
	    System.out.println(m);//3
	    System.out.println(n);//3
	
	    System.out.println("*********Pre Incrimental**********");
	    
	int a=2;//3
	int b=++a;//3
	
	System.out.println(a);
	System.out.println(b);
	}

}
