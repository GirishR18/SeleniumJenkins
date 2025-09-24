package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void contactTest() {
		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser");
		String UserName  = System.getProperty("username");
		String Password = System.getProperty("password");
		System.out.println(URL);
		System.out.println(Browser);
		
		System.out.println(UserName);
		System.out.println(Password);
		
		
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
