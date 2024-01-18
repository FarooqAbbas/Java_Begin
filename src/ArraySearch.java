import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		int number;
		boolean isfound = false;
		System.out.println("Enter 5 values");
		for(int i = 0;i<5;i++)
			n[i] = s.nextInt();
		System.out.println("Enter a number to search");
		number = s.nextInt();
		for(int i=0;i<5;i++)
			if(n[i] == number)
			{
				isfound = true;
				break;
			}
			else
				isfound = false;
		if (isfound == true)
		{
			System.out.println("Number found");
		}
		else 
			System.out.println("Number Not found");
	}
}
