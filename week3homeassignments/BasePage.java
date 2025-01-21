package week3homeassignments;


public class BasePage {

	 //Method findElement created
		public void findElement()
		{
			System.out.println("Element is found");
		}
		 //Method clickElement created
		public void clickElement()
		{
			System.out.println("Element is clicked");
		}
		 //Method enterText created
		public void enterText()
		{
			System.out.println("Text is entered");
		}
		 //Method performCommonTasks created
		public void performCommonTasks()
		{
			System.out.println("Common Task is performed");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BasePage b=new BasePage();
			b.clickElement();
			b.findElement();
			b.enterText();
			b.performCommonTasks();


	}

}
