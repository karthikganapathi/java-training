package JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateValuesPROGRAM2 {
	
	public static	String s="karthikganapathi";
	public static void main(String[] args) {
	    Map<Character,Integer> charmap=new HashMap<Character, Integer>();
	    char[] c = s.toCharArray();
	    for(Character ch:c){
	    	if(charmap.containsKey(ch)){
	    		charmap.put(ch,charmap.get(ch)+1);	
	    	}
	    	else{
	    		charmap.put(ch, 1);
	    	}
	    }
		  Set<Character> set = charmap.keySet();
		  for(Character ch:set){
			  if(charmap.get(ch)>1){
				  System.out.println(ch +"=	"+charmap.get(ch));
				  
			  }
			  	
		  }
}
}
