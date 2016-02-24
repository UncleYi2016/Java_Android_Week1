
public class Student {
	private String name;
	private IPet pet;
	
	Student(String name, IPet pet){
		this.name = name;
		this.pet = pet;
	}
	
	public String getName(){
		return name;
	}
	public IPet getPet(){
		return pet;
	}
	public void changePet(IPet pet){
		this.pet = pet;
	}
	
	public static void TestStudent(){
		IPet philippesCat = new Cat("ACat", 5.8);
		IPet philippesDog = new Dog("ADog", 103.8);
		Student s = new Student("Philippe", philippesCat);
		System.out.println(s.getName() == "Philippe");
		System.out.println(s.getPet().getName() == "ACat");
		System.out.println(s.getPet().getWeight() == 5.8);
		s.changePet(philippesDog);
		System.out.println(s.getPet().getName() == "ADog");
		System.out.println(s.getPet().getWeight() == 103.8);
	}
}
