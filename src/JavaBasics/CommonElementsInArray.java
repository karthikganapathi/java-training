package JavaBasics;

public final class CommonElementsInArray {

	public static void main(String[] args) {
		
		int []a1={4,7,3,9,2};
		int[]a2={3,12,2,9,40,30,4};
		
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){
				if(a1[i]==a2[j]){
					System.out.println(a1[i]+"");
					
				}
				
			}
			
		}
	}

}
