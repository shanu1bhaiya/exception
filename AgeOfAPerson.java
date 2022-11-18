import java.util.Scanner;

public class AgeOfAPerson 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age of the person");
		int age = sc.nextInt();
		
		try
		{
			if(age<=0)
				throw new Exception("age must be greater than zero");
			else
			{
				if(age>0 && age<10)
				{
					System.out.println("the person is a child");
				}
				else
					if(age>10 && age<18)
					{
						System.out.println("the person is a teenager");
					}
					else
					{
						System.out.println("the person is an adult");
					}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
}
}
