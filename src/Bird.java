
public class Bird extends Animal{
	private double altitude;
	
	Bird(String name, double weight, double altitude) {
		super(name, weight);
		this.altitude = altitude;
		// TODO Auto-generated constructor stub
	}
	
	public double getAltitude(){
		return altitude;
	}
	
	public static void TestBird(){
		Bird b = new Bird("ABird", 3.0, 100.3);
		System.out.println(b.getName() == "ABird");
		System.out.println(b.getWeight() == 3.0);
		System.out.println(b.getAltitude() == 100.3);
	}
}
