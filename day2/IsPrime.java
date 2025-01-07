package week1.day2;        

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=89;
		int c=0;
			for (int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
		
			if(c==2)
			{
				System.out.println("The given number is prime");
			}
			else
			{
				System.out.println("The given number is not prime");
			}
	    }
}
			
