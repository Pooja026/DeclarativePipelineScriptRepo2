import java.util.Scanner;

public class Fibbonacy 
{
	public static void fib(int n)
	{
		int a=0;
		int b=1;
		int c;
		if(n>=3)
		{
			System.out.print(a+" "+b);
			for(int i=2;i<n;i++)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
		}
		
		else
		{
			System.out.print(" "+1);
		}
	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number..");
		int z=sc.nextInt();
		fib(z);

	}

}
