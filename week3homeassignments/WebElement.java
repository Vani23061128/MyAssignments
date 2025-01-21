package week3homeassignments;

public class WebElement {

  //Method click is created
	
	 public void click(String fun)
	 {
		 System.out.println("Method clicked :" + fun);
	 }
	//Method set is created
	 public void setText(String text)
	 {
		 System.out.println("Text entered :" + text);
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebElement w= new WebElement();
			w.click("Login");
			w.setText("user and pwd entered");
		}

	}


