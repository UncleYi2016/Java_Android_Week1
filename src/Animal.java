
public class Animal implements IPet{
	private String name;
	private double weight;
	
	Animal(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String getName(){
		return name;
	}
	public double getWeight(){
		return weight;
	}
	
	public static void TestAnimal(){
		 Animal a = new Animal("Woof", 2.0);
		 System.out.println(a.getName() == "Woof");
		 System.out.println(a.getWeight() == 2.0);
	}
}
