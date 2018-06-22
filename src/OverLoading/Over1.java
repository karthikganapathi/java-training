package OverLoading;

public final class Over1 {
	
	public Integer Addition(int a,int b){
		
		int c;
		return  c=a+b;
		
		
	}

public void Addition(String i,int j){
		
		System.out.println("Adiition");
		
}
public void Addition(String x ,String y){
			
			System.out.println("Strings");
			
		}

public static void main(String[] args) {
	
	Over1 ov=new Over1();
	int c1=ov.Addition(4, 2);
	System.out.println(c1);
	
	ov.Addition("karthik", 2);
	ov.Addition("raki", "sudha");
	
	
	
}
	

}
