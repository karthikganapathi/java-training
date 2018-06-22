package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefindClassObject {

	public static void main(String[] args) {
		
		Students s1=new Students(1, "rakesh", 20);
		Students s2=new Students(2, "sudha", 21);
		Students s3=new Students(3, "karthik", 25);
		Students s4=new Students(4, "sai", 19);
		
		//creat a array list 
		ArrayList<Students>list=new ArrayList<Students>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//By using ITERATOR we can achieve that
		
		Iterator<Students> st = list.iterator();
		
		while(st.hasNext()){
			Students total = st.next();
           
		System.out.println(total.rollnum+" "+total.name+" "+total.age);
			
			}
		System.out.println("********");
		
		for(Students S:list){
			System.out.println(S.age+" "+S.name+" "+S.rollnum);
			
		}
		
		
		
		
	}

}
