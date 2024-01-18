import java.util.Scanner;

public class BigInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n,i=1,big=0;
		while(i<=10) {
			System.out.println("Please enter a number");
			n = s.nextInt();
			if(n>big)
				big = n;
			i++;
			}
		System.out.println("Big = "+big);

	}

}
