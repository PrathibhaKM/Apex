package maven;

import org.testng.annotations.Test;

public class ExampleTest {
	@Test(groups="smoke")
	public void Example1Test()
	{
		System.out.println("--Testscript--3");
	}
	
	@Test
	public void Example2Test()
	{
		System.out.println("--Testscript--4");
	}
	


}
