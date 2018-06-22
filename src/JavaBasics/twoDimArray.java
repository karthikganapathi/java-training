package JavaBasics;

public class twoDimArray {

	public static void main(String[] args) {
		
		
	String s[][]=new String[3][4]; 
	
	System.out.println(s.length);//it gives total number of rows :- 3
	System.out.println(s[0].length);//it gives total number of rows :- 4
	
	s[0][0]="a";
	s[0][1]="b";
	s[0][2]="c";
	s[0][3]="d";
	
	s[1][0]="k";
	s[1][1]="a";
	s[1][2]="r";
	s[1][3]="t";
	
	s[2][0]="1";
	s[2][1]="2";
	s[2][2]="3";
	s[2][3]="4";
	
	System.out.println(s[2][2]);//3
	
	// print all the values of 2d array:Use for loop
	
	for(int row=0;row<s.length;row++){
		for(int col=0;col<s[0].length;col++){
			System.out.println("The values of 2d array are:"+s[row][col]);
			
		}
		
	}
	
	
	
	
	}

}
