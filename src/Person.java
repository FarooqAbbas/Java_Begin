
public class Person {
	int age;
	String name ;
	
	Person(int age , String name)
	{
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(26,"Sunflower");
		System.out.println("Age = "+p1.age);
		System.out.println("Name = "+p1.name);
		Person p2 = new Person(32 , "Olive Flower");
		System.out.println("Age = "+p2.age);
		System.out.println("Name = "+p2.name);
	}

}
