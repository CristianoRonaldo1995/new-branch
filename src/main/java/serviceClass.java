import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.gson.Gson;

public class serviceClass {
	
	private HashMap<Integer, accountClass> hmap = new HashMap<Integer, accountClass>();
	private Gson gson = new Gson();
	private int counter = 0;
	
	public void adding(accountClass acc) {
		if(exists(acc.getFirstName())) {
			counter ++;
		} else {
			hmap.put(counter, acc);
		}
		
	
	}

	public void retrieving() {
		
		for(accountClass account: hmap.values()) 
		{
			System.out.println(account.getFirstName());
		}
	}
	
	public void convertingJavaObjToJson() {
		
		String json = gson.toJson(hmap);
		System.out.println(json);
	}

	public int countAccount(String string) {
	
		return counter;
	}
	
	private boolean exists(String firstName) {
		for(Map.Entry<Integer, accountClass> account : hmap.entrySet()) {
			if(account.getValue().getFirstName().equals(firstName)) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
