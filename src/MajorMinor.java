import java.util.Scanner;

public class MajorMinor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if (age > 18)
		{
			System.out.println("Major");
		}
		else 
			if (age < 0)
				System.out.println("Invalid");
			else 
				System.out.println("Minor");
		}

}
