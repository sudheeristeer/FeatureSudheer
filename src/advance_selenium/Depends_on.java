package advance_selenium;
import org.testng.annotations.Test;
public class Depends_on {
	@Test(enabled=true)
	public void monyDepsite()
	{
		System.out.println("Money deposite successfully");
	}
	@Test(dependsOnMethods="monyDepsite")
	public void checkBalence()
	{
		System.out.println("balence checked successfully");
	}
	@Test
	public void withDraw()
	{
		System.out.println("with draw successfully");
	} 
}
