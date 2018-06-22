package OopsConcept1;

public class WrapperClass {

	public static void main(String[] args) {
		
		//How to Convert String into Integer
		//by using Integer.paraseint
		
		String a="10";
		System.out.println(a+20);
		int a1=Integer.parseInt(a);
		System.out.println(a1+20);
		
		//String to double

		String b="12.33";
		
		System.out.println(b+20); //12.3320
		Double D=Double.parseDouble(b);
		System.out.println(D+20); //32.33
		
		// How to convert Integer to String
		// String.Valueof is used to convert Integer to string
		int i=10;
		
		System.out.println(i+20);
		
		String s1=String.valueOf(i);
		System.out.println(s1+20);
		
		
		
	}

}
