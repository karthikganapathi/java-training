package JavaBasics;

public class PrimeNumbersOneToHundred {
	   public static void main (String[] args){ 
	       int i =0;
	       int num =0;
	       String  primeNumbers = "";
	 
	       for (i = 1; i <= 100; i++){   	  
	          int counter=0;   
	          for(num =i; num>=1; num--){
	             if(i%num==0){
	             counter = counter + 1;
	             }
	          }
	   if (counter ==2){
	      primeNumbers = primeNumbers + i + " ";
	   } 
	       } 
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   //1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
	     //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97     
	   
	   }
	   }
