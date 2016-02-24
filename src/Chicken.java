
public class Chicken extends Bird{
	Chicken(String name,double weight, double altitude){
		super(name,weight,altitude);
	}
	
	public static void TestChicken(){
		Chicken c = new Chicken("AChicken", 3.0, 100.3);
		System.out.println(c.getName() == "AChicken");
		System.out.println(c.getWeight() == 3.0);
		System.out.println(c.getAltitude() == 100.3);
	}

}
