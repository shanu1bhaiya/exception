import java.util.Scanner;


public class RootsOfAQuadraticEquation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("enter the value of a");
		float a = sc.nextFloat();
		try
		{
			if(a==0)
			{
				throw new ArithmeticException("value of a must not be equal to zero");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("enter the value of b");
		float b = sc.nextFloat();
		
		System.out.println("enter the value of c");
		float c = sc.nextFloat();
		
		float D = b*b - 4*a*c;
		try
		{
			if(D<0)
			{
				throw new ArithmeticException("roots of the equation are imaginary");
			}
			else
				if(D>0)
				System.out.println("roots of the equation are real");
				else
					System.out.println("roots of the equation are real");
				System.out.println("value of D is " + D);
		
		double x1 = (-b + Math.sqrt(D))/2*a;
		double x2 = (-b - Math.sqrt(D))/2*a;
		
		System.out.println("the roots of the quadratic equation are"+ x1 + " " + x2);
	}

	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
