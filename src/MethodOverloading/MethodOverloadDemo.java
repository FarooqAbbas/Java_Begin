package MethodOverloading;

public class MethodOverloadDemo {
	
	public int multiply(int x , int y)
	{
		return (x * y);
	}	
	public int multiply(int x , int y, int z)
	{
		return (x * y * z);
	}	
	public double multiply (double x, double y)
	{
		return (x * y);
	}
	
	public static void main (String args[])
	{		
//		MethodOverloadDemo mdol = new MethodOverloadDemo();
//		
//		double mdol1 = mdol.multiply(1.2, 1.2);
//		System.out.println(mdol1);		
//		 
//		int molmul = mdol.multiply(2,2);
//		System.out.println(molmul);
//		
//		int threemul = mdol.multiply(2,2,3);
//		System.out.println(threemul);
		
		Bicycle bicycle = new Bicycle(10 , 1);
		System.out.println("Bicycle gear is : " + bicycle.gear);
		System.out.println("Bicycle speed is : " + bicycle.speed);
		
		bicycle.applyBrake(1);
		System.out.println("......................");
		
		System.out.println("Bicycle gear is : " + bicycle.gear);
		System.out.println("Bicycle speed is : " + bicycle.speed);		
	}

}
