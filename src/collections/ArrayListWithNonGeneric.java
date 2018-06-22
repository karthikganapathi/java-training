package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithNonGeneric {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		list.add("Karthik1");
		list.add('c');
		list.add(23456);
		list.add(true);
		list.add(10.2354);
		
		
		System.out.println(list.get(2));
		System.out.println(list);
		
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
