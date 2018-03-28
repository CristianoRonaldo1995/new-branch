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
		
		// assertEquals(hmap(), IsMapContaining.hasValue("naveed"));
		 accountClass ac = new accountClass("naveed", "farouq", 23);
		 int counter = hmap.countAccount("naveed");
		 assertEquals(1, counter);
		 
	}

}
