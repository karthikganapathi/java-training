package OopsConcept1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayConceptWithLoops {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("karthik");
		ar.add("karthikpatel");
		ar.add("Ganapathi");
		ar.add("selemium");
		ar.add("8297651613");
		
		//using for Loop we can get all the values
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
			
		}
		System.out.println("***************************");
		//By using Itertor
		Iterator<String> a = ar.iterator();
		  while(a.hasNext()){
			  System.out.println(a.next());
		  }
		  //By using Advance for loop
		  System.out.println("***************************"); 
		  for(String sr:ar){
			  System.out.println(sr);
			  
		  }
		  
//**************************************************************************************************
		  ArrayList<Object>ar1=new ArrayList<Object>();
		  ar1.add("karthik ia a good boy");
		  ar1.add('M');
		  ar1.add(5.6);
		  ar1.add(true);
		  
		  // to get all the values we need to use
		  // For loop
		  //while loop
		  //Iterator
		  //Advance for loop
		  
	System.out.println("********By usin For loop**********");	 
	for(int j=0;j<ar1.size();j++){
		System.out.println(ar1.get(j));
		
	}
		  
	System.out.println("********By using Iterator**********");	 
			
	  Iterator<Object> k = ar1.iterator();
	  while(k.hasNext()){
		  System.out.println(k.next());
	  }
	  System.out.println("********By using ADVANCED FOR LOOP**********");	 
		
	  for(Object obj:ar1){
		  System.out.println(obj);
		  
	  }
	
	}

}
