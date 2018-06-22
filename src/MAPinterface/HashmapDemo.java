package MAPinterface;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "karthik");
		map.put(2, "rakesh");
		map.put(3, "sudha");
		map.put(4, "sai");
		map.put(5, "soujanya");
		map.put(7, "dhayasri");
		
		System.out.println(map.get(3));
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String>values:map.entrySet()){
			System.out.println(values.getKey() +"== "+values.getValue());
			
		}
		
		
		
		
		
		
	}

}
