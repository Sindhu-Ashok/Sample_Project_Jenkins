import org.testng.Reporter;
import org.testng.annotations.Test;

//Changes from Branch1
public class SampleTest 
{
	@Test
	public void testName() throws Exception 
	{
		Reporter.log("Heyyy",true);
		Reporter.log("Heyy-Heyyy",true);
		Reporter.log("Heyyy-Heyyy-Heyyy",true);
		Reporter.log("Byyeee",true);
	}
}
