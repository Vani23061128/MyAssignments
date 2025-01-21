package week3homeassignments;



public class TextField extends WebElement
	  //Method getText created
	{
		public void getText(String userdet)
		 {
			 System.out.println("Provide details :" +userdet);
		 }


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TextField t = new TextField();
			  t.click("Login");
			  t.getText("Username and password entered");
			  t.setText("User login succesfull");
		     
	    
		}
	}
	





