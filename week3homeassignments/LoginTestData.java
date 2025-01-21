package week3homeassignments;


public class LoginTestData extends TestData {
	public void enterUsername(String name)
	{
		System.out.println("UserName : "+name);
	}
	public void enterPassword(String pwd)
	{
		System.out.println("Password : "+pwd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData l=new LoginTestData();
		l.enterCredentials("Testleaf login page");
		l.enterUsername("Test");
		l.enterPassword("leaf@23");
		l.navigateToHomePage("Chrome");
	
	}

}





