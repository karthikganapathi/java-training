package JavaBasics;

import java.util.Scanner;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		
		int i=987;
		
		StringBuffer StringBuffer = new StringBuffer(String.valueOf(i));
		System.out.println(StringBuffer.reverse()	);
		
	// **************By giving INPUT*******************************	
	/*Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	
	 int ori=scan.nextInt();
		int rev=0;
		int reminder;
		
		while(ori!=0){
			reminder =ori  %10;
			rev=rev*10+reminder;
			ori=ori/10;
			
		}
		
		System.out.println(rev);*/
		
		
		
		/*int original=345;
		int reverse =0 ;
		
		
		while(original==0){//it will check reverse is equal to zero or not ,if not equal to zero it will enter into while loop
			
			reverse=reverse*10+original%10;//5
			original=original/10;//340//3
			
			
			
		}
		System.out.println(reverse);*/
	}

}


///



