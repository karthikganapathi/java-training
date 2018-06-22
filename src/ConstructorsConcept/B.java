package ConstructorsConcept;

public class B extends A {
	
	
	public B(){
		super();
		
		System.out.println("B constructor with no parameter  has been called");
	}
	public B(int i){
		super(i);
		
		System.out.println("B constructor with parameter has been called");
	}
	
	public static void main(String[] args) {
		B obj=new B();
		B obj1=new B(10);
		
		
		
	}

}
