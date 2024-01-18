
public class TerritaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10 , b = 40 , c = 30, max;
		
		max = (a>b) ? (a>c ? a:c) : (b>c ? b:c);
		
		System.out.println("Max is = "+ max);

	}

}
