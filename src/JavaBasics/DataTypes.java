package JavaBasics;

public class DataTypes {
	
	
   //main() method--->starting/execution point of program.
	public static void main(String[] args) {
		
		//integer values
		int i=10;
		int j=20;
		
		//char values are stored with in single quotes with single value only 
		char a='f';
		char kar='u';
		
		//double is used to store decimal values
		double d=23.55;
		double d1=2223.599;
		
		// String is used to any values ,but with in double quotes
		
		String s1="karthik";
		String s2= "patel";
		String s3="42";
		String s4="55.3";
		
		//in string concatenation any value after the string it won't add the numbers
		//for example the below output gives 
	 System.out.println(s1+i+j);//karthik1020
	 System.out.println(s1+s2+(i+j));//karthikpatel30
	 System.out.println(i+j+(s1+s2));//30karthikpatel
	 System.out.println(i+s1+j+d);//10karthik2023.55
	 System.out.println(a+i+j+s1);//132karthik
	 
		
	}

}
