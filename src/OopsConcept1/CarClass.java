package OopsConcept1;

public class CarClass {

	//Class variable
  char model;
  int year;
  
	public static void main(String[] args) {
		
	//CarClass ----> Is a CLASS
	// new CarClass()----> Is a Object	of CarClass
	// a,b,c ---> Object Reference variable of Class	
	CarClass i=new CarClass();
	CarClass j=new CarClass();
	CarClass k=new CarClass();
	
	i.model='a';
	i.year=2015;
	
	j.model='b';
	j.year=2016;
	
	
	k.model='c';
	k.year=2017;
	
	//System.out.println(j.model);
	
	int a=10;
	int b=20;
	int c=30;
	
	a=b;
	b=c;
	c=a;
	
	
	System.out.println(a);

	System.out.println(b);
	System.out.println(c);
	}

}
