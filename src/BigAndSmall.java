
public class BigAndSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {50,20,7,40,10,60,70,100};
		int big,secondBig,small,secondSmall;
		small = n[0];
		big = n[0];
		for(int i = 0; i < n.length;i++)
		{
			if (small < n[i])
			{
				continue;
			}
			else
				small = n[i];			 
		}
		System.out.println("Small = "+small);
		for(int y = 0; y < n.length;y++)
		{
			if (big > n[y])
			{
				continue;
			}
			else
				big = n[y];			 
		}
		System.out.println("Big = "+ big);
	}
}
