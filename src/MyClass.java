// static keyword
public class MyClass {
	
	int n;
	static int m;
	
	void xxx()
	{
		n = 29;
		m = 28;
	}
	
	static void yyy()
	{
		m = 30;
		//n = 28;
	}
	
	void display()
	{
		System.out.println("m="+ m + " " +"n="+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		MyClass.yyy();
		mc.xxx();		
		mc.display();
	}

}
