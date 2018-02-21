public class HelloWorld
{
	public static void main(String[] args)
	{	
		System.out.println("Hello World");
		System.out.println("We going to see the factorial concept;");
		final int NUM_FACTS = 6;
		for(int i = 1; i < NUM_FACTS; i++)
			
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}