package mavenparametertest;

import org.testng.annotations.Test;

public class mavenparaTest {
	
	@Test
	
	public void ReadData() {
		
		String Browser = System.getProperty("browser");
		System.out.println("browser is:" +Browser);
		
		String URL = System.getProperty("url");
		System.out.println("URL is:" +URL);
		
		
		
		
		
		
	}

}
