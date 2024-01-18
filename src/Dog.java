
public class Dog {
	
	String name;
	String breed;
	public Dog(String name, String breed)
	{
		this.name = name;
		this.breed = breed;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog white = new Dog("silver" , "Rotviler");
	}

}
