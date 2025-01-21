package week3homeassignments;
public class LoginPage extends BasePage {
	
	//@Override
	public void performCommonTasks()
	{
		System.out.println("Common Task activity is performed again");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage l=new LoginPage();
		l.clickElement();
		l.enterText();
		l.findElement();
		l.performCommonTasks();
		

	}

}


