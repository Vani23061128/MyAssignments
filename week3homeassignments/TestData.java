package week3homeassignments;

public class TestData {


		// TODO Auto-generated method stub
		public void enterCredentials(String name)
		{
			System.out.println("Name : "+name);
		}
		public void navigateToHomePage(String name)
		{
			System.out.println("Page is navigated to : "+name);
		}
		public static void main(String[] args) {
			TestData t=new TestData();
			t.enterCredentials("test");
			t.navigateToHomePage("Chrome");
	}

}




