package JavaBasics;

public class LoopStatement {

	public static void main(String[] args) {
		// 1) While loop concept 
		// Print the 1 to 10 values 
		//** dis-advatage of while loop:it will generate infinate loop if you dont give incremental/decreental part
		
		int i=1; //Initialization
		
		while(i<=10){  //conditional
			System.out.println(i);
			i=i+1; //Incremental/Decremental part should be there in while loop	
			
		}
		
		System.out.println("+++++++++++++++++++++");
		
		
		
		// 2) for loop:-
		// print 1 to 10 values
		for(int j=1;j<=10;j++){ //Initialization + conditon + Incremental
			System.out.println(j);
		}
		
		System.out.println("+++++++++++++++++++++");
		
		// 3) for Loop:-
		//print 10 to 1 values
		
		for(int k=10;k>=-10;k--){
			System.out.println(k);
		}
		
		 

	}

}
