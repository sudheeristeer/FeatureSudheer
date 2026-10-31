package advance_selenium;

import org.testng.annotations.Test;

public class Invocation_count
{
	@Test(priority=1 ,invocationCount=10)
public void Usercreate()
{
	System.out.println("user created successfully");
}
@Test(priority=2)
public void modifyUser()
{
	System.out.println("user modifyed successfully");
}
@Test(priority=3)
public void searchUser()
{
	System.out.println("user search successfully");
} 
@Test(priority=4)
public void deleteUser()
{
	System.out.println("user deleted successfully");
} 

}
