package advance_selenium;

import org.testng.annotations.Test;

public class TestNG_demo {
	@Test(priority=0)
  public void CreateUser()
  {
	  System.out.println("user created succesfully");
  }
	@Test(priority=-1)
  public void ModifyUser()
  {
	  System.out.println("user modifyed succesfully");
  }
	@Test(priority=-2)
  public void DeleteUser()
  {
	  System.out.println("user deleted succesfully");
  }
}
