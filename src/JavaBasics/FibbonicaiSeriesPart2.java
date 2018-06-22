package JavaBasics;

public class FibbonicaiSeriesPart2 {

	public static void main(String[] args) {
	//Fibbonicai series is nothing but SUM OF FIRST TWO NUMBERS
   // So we need to take the two constant integer values
		
 		int FirstNumber=0;
 		int SecondNumber=1;
 		
 		System.out.print(FirstNumber+" ");
 		System.out.print(SecondNumber+ " ");
 		for(int i=0;i<10;i++){
 			int ThirdNumber=FirstNumber+SecondNumber;
 			System.out.print(ThirdNumber +" ");
 			
 			FirstNumber=SecondNumber;//changing the preference 
 			SecondNumber=ThirdNumber; //changing the preference
 		}
	
		
	}

}
