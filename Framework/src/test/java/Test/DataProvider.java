
package Test;

public class DataProvider extends BaseTest {

	

			@org.testng.annotations.DataProvider(name="Login")
			public Object[][] getData()
			{
				return new Object[][] { {"Admin","admin123"}
					
					
				};
			}
			@org.testng.annotations.DataProvider(name="Newuser")
			public Object[][] getdata2(){
				return new Object[][] { {"Admin","Linda Anderson","l.anderson12378","Enabled","Automation@123","Automation@123" }
					
					
				};
				
			}
			@org.testng.annotations.DataProvider(name="SearchUser")
			public Object[][] getData1(){
				return new Object [][] {{"l.anderson123"}};
				
			}

		}
