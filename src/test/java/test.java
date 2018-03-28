import static org.junit.Assert.*;

import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {

	serviceClass hmap;
	
	@Before
	public void before() {
		hmap = new serviceClass();
	}
	
	@Test
	public void lookingForValuesInHMAP() {
		
		
		 accountClass ac = new accountClass("naveed", "farouq", 23);
		 hmap.adding(ac);
		 int count = hmap.countAccount("naveed");
		 assertEquals(1, count);
		 
	}

}
