import java.util.HashMap;

import com.google.gson.Gson;

public class serviceClass {
	
	private HashMap<Integer, accountClass> hmap = new HashMap<Integer, accountClass>();
	private Gson gson = new Gson();
	private int counter = 0;
	
	public void adding(accountClass firstName) {
		
		hmap.put(counter, firstName);
		counter++;
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
	
	
	

}
