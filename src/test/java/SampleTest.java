import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest 
	//CHANGES
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
//CHANGESSS
