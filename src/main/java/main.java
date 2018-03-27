import com.google.gson.Gson;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accountClass ac = new accountClass("naveed", "farouq", 23);
		
		
		serviceClass sc = new serviceClass();
		sc.adding(ac);
		sc.retrieving();
		sc.convertingJavaObjToJson();
			
	}

}
