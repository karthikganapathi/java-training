package ConstructorsConcept;

public class Constructors {
	
	///There is a default constructor in a class (Hidden constructor in a class)
	//we can call constructor only after creating the object.
	//We can overload constructor 
	
	
	public Constructors(){
		System.out.println("counstructor has been called");
	}
	
	public Constructors(int i){
		System.out.println("counstructor has been called the value is:"+i);
	}
	public Constructors(int j,String s){
		System.out.println("counstructor has been called the value is:"+j +"&" +s);
	}
	public static void main(String[] args) {
		Constructors obj=new Constructors();
		Constructors obj1=new Constructors(10);
		Constructors obj2=new Constructors(10,"Karthik");
		
	}

}
