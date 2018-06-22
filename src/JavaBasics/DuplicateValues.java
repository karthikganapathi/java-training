package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValues {
	
	public static	String s="karthikganapathi";
	public static void main(String[] args) {
	
	int	distinct=0;
		for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+distinct);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        distinct = 0;
	}
System.out.println("*********************");
	
	
	
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	for (int i = 0; i < s.length(); i++) {
	  char c = s.charAt(i);
	  if (map.containsKey(c)) {
	    int cnt = map.get(c);
	    map.put(c, ++cnt);
	  } else {
	    map.put(c, 1);
	  }
	  
	}
	
	
	System.out.println(map);
	System.out.println(map);
	
}
}
