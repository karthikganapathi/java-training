package JavaBasics;

public class MatrixAddition {

	public static void main(String[] args) {
		
		
		int [][]  m1= new int[3][3];
		int [][]  m2= new int[3][3];
		int [][]  m3= new int[3][3];
		
		int i,j;
		
		for( i=0;i<m1.length;i++){
			
			for(j=0;j<m1[i].length;j++){
				m1[i][j] =(int)(Math.random()*10);
				
				m2[i][j] =(int)(Math.random()*10);
				m3[i][j] =m1[i][j]+m2[i][j];
			}
		}
		
		System.out.println("first matrix");
		for(i=0;i<m1.length;i++){
			for(j=0;j<m1[i].length;j++){
				System.out.println(m1[i][j] + "   ");	
			}
			
		}
		System.out.println("second matrix");
		
		for(i=0;i<m2.length;i++){
			for(j=0;j<m2[i].length;j++){
				System.out.println(m2[i][j] + "  ");	
			}
			
		}
		System.out.println("third matrix");
		
		for(i=0;i<m3.length;i++){
			for(j=0;j<m3[i].length;j++){
				System.out.println(m3[i][j] +  "   ");	
			}
			
		}
	}

}
