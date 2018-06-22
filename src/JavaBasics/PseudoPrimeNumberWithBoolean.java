package JavaBasics;

public class PseudoPrimeNumberWithBoolean {

	public static void main(String[] args) { 
		
			for(int i=1;i<=100;i++){
				
				boolean flag=true;//int temp=0;
				for(int j=2;j<=i-1;j++){
					
					if(i%j==0){
						flag=false;//temp=temp+1;
						
						break;
					}
					
				}
				if(flag==true){//if(temp==0){
					System.out.println(i);
				}
				
			}
		
		}
		
	}


