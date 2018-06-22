package AbstractMethods;

public abstract class Bank { 
	// The class is said to abstract when ever we add a {ABSTRACT} keyword for that class
	// Hiding the implementation logic ---is called Abstraction
   //Abstract class can have Abstract methods and non Abstract methods also
	//Partial Abstraction 
	// we cannot create the object of abstract classes
	
	
	public abstract void loan(); //abstract method--no method body only method proto-type
	// we cannot write {STATIC} keyword in the abstract method.
	//The abstract method loan in type Bank can only set a visibility modifier, one of public or protected

   public void Credit(){ //Non Abstract Methods
	    System.out.println("Bank has ---Credit method ");
   }
   
   
   public void Debit(){ //Non Abstract Methods
	    System.out.println("Bank has ---Debit method ");
  }
	
}