package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void contactTest() {
		System.out.println("Contact is getting Created ");
	}

	@Test
	public void contactSearch() {
		System.out.println("Contact is getting searched ");
	}
	
	@Test
	public void contactDelete() {
		System.out.println("Contact is getting Deleted ");
		System.out.println("Congrats");
	}

}
