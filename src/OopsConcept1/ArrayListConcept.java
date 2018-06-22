package OopsConcept1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int s[]=new int[3]; //Static array----Size is fixed
		
		//Dynamic Array --->ArrayList:-we need to import from java.Util
		//1)it can allow duplicate values
		//2)it maintains insertion order
		//3) its n	ot Synchronized
		//4) allows random access to fetch the element because it stores the values on the basis of indexes. 
		
		//The below ArrayList is Non-generic
		ArrayList ar =new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		// to get all the values of arrayList we need use(For Loop) & Iterator
       
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
			
		}
		
		
		
		//Generic ArrayList ()When u want to store particualr values we use generic concept
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("Karthik");
		ar1.add("Rakesh");
		ar1.add("sudha");
		ar1.add("sai");
		ar1.add("soujanya");
		
		System.out.println(ar1.get(3));
		
		
		
		//ArrayList<E> ar2=new ArrayList<E>();
		
		EmployeeArray e1=new EmployeeArray("krthik", "dev", 25);
		EmployeeArray e2=new EmployeeArray("rakesh", "test", 26);
		EmployeeArray e3=new EmployeeArray("sai", "admin", 27);
		
		ArrayList <EmployeeArray>ar2=new  ArrayList<EmployeeArray>();
		ar2.add(e1);
		
		ar2.add(e2);
		ar2.add(e3);
		
		System.out.println(ar2.size());
		
		
           Iterator<EmployeeArray> it = ar2.iterator();		
           while( it.hasNext()){
        	 EmployeeArray emp = it.next();
       	 System.out.println(emp.name);
       	System.out.println(emp.age);
       	System.out.println(emp.deprt);
      	 
      	 
       
        }
		
	}

}
