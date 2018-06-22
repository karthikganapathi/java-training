package JavaBasics;

public class DistinctValues {

	 public static int[] s= {6,5,6,5,4,8,6,2,3};
	// public static String s1= "6,5,6,5,4,8,6,2,3";
	      
	public static void main(String[] args) {
	
//		for(int i=0;i<s.length;i++){
//			boolean isDistinct=false;
//			for(int j=0;j<i;j++){
//				if(s[i]==s[j]){
//					isDistinct=true;
//					break;
//				}
//			}
//			if(!isDistinct){
//				System.out.println(s[i]+"   ");
//			}
//			
//		}
		System.out.println("*************");
		for(int i=0;i<s.length;i++){
			boolean distinct=false;
			for(int j=0;j<i;j++){
				if(s[i]==s[j]){
				distinct=true;
				break;
				}	
			}
			if(!distinct)
			System.out.println(s[i]+"  ");
			
		}
		
		

	}

}
