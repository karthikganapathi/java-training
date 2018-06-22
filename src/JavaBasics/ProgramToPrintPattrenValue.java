package JavaBasics;

public class ProgramToPrintPattrenValue {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");	
			}
			System.out.println();
		}
	

	String a="string";
	for(int a1=a.length()-1;a1>=0;a1--){
		System.out.print(a.charAt(a1));
		
	}
	
long num=12345678;

//System.out.println(new StringBuffer(String.valueOf(num)).reverse());
StringBuffer s=new StringBuffer();

   // s.append(num);

     System.out.println(s.reverse()) ;
     
}


}