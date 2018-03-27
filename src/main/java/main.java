
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accountClass ac = new accountClass();
		ac.setFirstName("naveed");
		ac.setLastName("farouq");
		ac.setAccountNumber(1233);
		
		
		serviceClass sc = new serviceClass();
		sc.adding(ac, 23);
		sc.adding(ac, 24);
		
		sc.retrieving();
		
	}

}
