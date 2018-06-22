package JavaBasics;

public class Ifelse {

	public static void main(String[] args) {
		
		int a=40;
		int b=30;
		
		
		if(a<b){
			System.out.println("true");
			
		}
		else{
			System.out.println("false");
		 
		}
		
		//comparison operators
		//-----(( <,>, <=,>=,==,=! ))----------
	
		int c=10;
		int d=10;
		
		if(c==d){
			System.out.println("equal numbers");
		}
		else{
			System.out.println("not equal numbers");
		}
		
		
	// how to write a logic to find the given numbers
		
		
		int a1,a2,a3;
		a1=3000;
		a2=1400;
		a3=500;
		// For (&)and operator 
		// the below logic is T & T =T
		// the below logic is T & F =F
		// the below logic is F & F =F
		
			
		
		if(a1>a2 & a1>a3){
			System.out.println("a1 is the greatest number");	
		}
		else if (a2>a3){
			System.out.println("a2 is the greatest number");
		}
		else{
			System.out.println("a3 is the greatest muber");
		}
		
		
		
		
	}
}
