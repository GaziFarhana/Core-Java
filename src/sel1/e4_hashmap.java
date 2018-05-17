package sel1;

import java.util.HashMap;

public class e4_hashmap {

	public static void main(String[] args) {
		

		
		HashMap<String,String> m=new HashMap<String,String>();
	m.put("first_name", "Steven");
	m.put("last_name", "king");
	m.put("age", "25");
	m.put("city", "NYC");
	m.put("state","NY");
	
	System.out.println(m.get("first_name"));
	System.out.println(m.get("last_name"));
	System.out.println(m.get("age"));
	System.out.println(m.get("city"));
	
	
	
	
	
	
	}

}
