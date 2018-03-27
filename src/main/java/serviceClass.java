import java.util.HashMap;

public class serviceClass {
	
	private HashMap<accountClass, Integer> hmap = new HashMap<accountClass, Integer>();
	
	public void adding(accountClass firstName, int accountNumber) {
		
		hmap.put(firstName, accountNumber);
	}

	public void retrieving() {
		System.out.println(hmap.toString());
	}
	

}
