package basicprogram;

public class Avinash 
{
	public static void input(String str)
	{
		int count=0;
		char[] a1=str.toCharArray();
		System.out.println("Duplicate letters are:");
 		{
			for(int j=i+1;j<str.length();j++)
			{
				if(a1[i]==a1[j])
				{
					System.out.println(a1[j]);
					count++;
					break;
				}
			}
			

		}
		
		
		
	}

	public static void main(String[] args) 
	{
	String str="my name is avinsh";
	input(str);

	}

}
