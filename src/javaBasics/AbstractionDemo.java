package javaBasics;

public class AbstractionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
		
		GraphicObject rectangle =  new Rectangle();
		rectangle.draw();
		rectangle.resize();
		
		
	}

}
