package Inheritence;

public class Childclass  extends Base{
	
	public void test4(){
		System.out.println("test4");
		
	}

	
	public void test5(){
		System.out.println("test5");
		
	}
	public static void main(String[] args) {
		
		Childclass c=new Childclass();
		c.test1();
		c.test2();
		c.test3();
		c.test3();
		c.test4();
		c.test5();
		Base c1=new Base();
		c1.test1();
		c1.test2();
		c1.test3();
		
		Base b1=new Childclass();// Dynamic POLYMORPHISM (TOP CASTING)
		b1.test1();
		b1.test2();
		b1.test3();
		
		
		
		

	}

}
