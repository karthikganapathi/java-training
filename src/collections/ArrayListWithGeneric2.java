package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithGeneric2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  list.add("bajay");
		
		System.out.println("***************");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));	
		}
		
		System.out.println("***************");
		for(Object a:list){
			System.out.println(a);
		}
		
		System.out.println("***************");
		
	Iterator iter = list.iterator();
	while(iter.hasNext()){
		Object o=iter.next();
		System.out.println("By using Iterator:"+o);
	}
	}

}
