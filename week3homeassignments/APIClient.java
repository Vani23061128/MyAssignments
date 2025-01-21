package week3homeassignments;


public class APIClient {
		// Method 2 with single argument
		public void sendRequest(String endpoint)
		{
			System.out.println("Client endpoint:"+ endpoint);
		}
		// Method 1 with three arguments
		public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
		{
			System.out.println("Client endpoint:"+ endpoint);
			System.out.println("Client request:"+ requestBody);
			System.out.println("Client requestStatus:"+ requestStatus);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      APIClient ap=new APIClient();
	      ap.sendRequest("192.89.45.8");
	      ap.sendRequest("192.89.45.8","Active",true);
	      
		}

	



	}


