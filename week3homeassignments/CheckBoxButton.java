package week3homeassignments;


	public class CheckBoxButton extends Button 
	//Method clickCheckButton created
	   {
	    public void  clickCheckButton(String check)
	    {
	    	System.out.println(" Button:"+ check);
	    }
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CheckBoxButton c=new CheckBoxButton();
			c.clickCheckButton("Check button clicked");
			c.setText("Buttons are verified");
		}

	}


