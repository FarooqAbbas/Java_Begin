import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Z");
		hashSet.add("A");

		boolean r1 = hashSet.add("B");
		boolean r2 = hashSet.add("B");
		
		System.out.println(r1);
		System.out.println(r2);
		
		hashSet.add("C");
		
		
		
		System.out.println(hashSet);		
		System.out.println("List contains C or not ? " + hashSet.contains("C"));
		
		hashSet.remove("A");
		System.out.println("Set after removing A: " + hashSet);		
		System.out.println(hashSet);
		 
		for(String item : hashSet) {
			System.out.println(item);
		}
	}
}
