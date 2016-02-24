
public class Dog extends Animal{
	
	Dog(String name, double weight){
		super(name, weight);
	}
	
	
	public static void TestDog(){
		 Dog d = new Dog("Woof", 2.0);
		 System.out.println(d.getName() == "Woof");
		 System.out.println(d.getWeight() == 2.0);
		 // The name is still the same but the weight increased by 2.0:
		 System.out.println(d.getName() == "Woof");
	}
}
