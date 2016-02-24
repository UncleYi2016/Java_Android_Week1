
public class Cat extends Animal{
	
	Cat(String name, double weight){
		super(name, weight);
	}
	
	 public static void TestCat() {
		 Cat c = new Cat("Meow", 2.0);
		 System.out.println(c.getName() == "Meow");
		 System.out.println(c.getWeight() == 2.0);
		 // The name is still the same but the weight increased by 1.0:
		 System.out.println(c.getName() == "Meow");
	}
}
