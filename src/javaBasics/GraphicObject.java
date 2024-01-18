package javaBasics;

public abstract class GraphicObject {
	int x, y;
	
	GraphicObject(){
		System.out.println("...................");
		System.out.println("base abstract class");
		System.out.println("...................");
	}
	
	void moveTo(int newX , int newY) {
		System.out.println("move to x :"+x+" and y:"+y);
	}
	
	abstract void draw();
	abstract void resize();

}
