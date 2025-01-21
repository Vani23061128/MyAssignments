package week3homeassignments;



public class Button extends WebElement
    //Method submit is created
  {
	 public void submit(String cred)
	 {
		 System.out.println(" After clicking submit :" +cred);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Button b=new Button();
      b.click("Login");
	  b.setText("Username and password");
      b .submit("Web page Login succesfull");
    
	}





	}


