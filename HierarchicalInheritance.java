// 1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
// Subclasses extend the superclass and override its location() and famousFor() method. 
// i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. 
// As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime.
// ii.call the location() and famousFor() method by the all subclass’,and print accordingly.


class HillStations{
	public void location(){
		System.out.println("Hill stations are located in mountainous regions.");
	}
	
	public void famousFor() {
		System.out.println("They are famous for their natural beauty.");
	}
}

class Manali extends HillStations{
	public void location(){
		System.out.println("Manali is located in Himachal Pradesh.");
	}
	
	public void famousFor() {
		System.out.println("Manali is famous for snow and adventure sports.");
	}
}

class  Mussoorie extends HillStations{
	public void location(){
		System.out.println("Mussoorie is located in Uttarakhand.");
	}
	
	public void famousFor() {
		System.out.println("Mussoorie is famous for scenic views and waterfalls.");
	}
}

class Gulmarg extends HillStations{
	public void location(){
		System.out.println("Gulmarg is located in Jammu & Kashmir.");
	}
	
	public void famousFor() {
		System.out.println("Gulmarg is famous for skiing and snow-covered mountains.");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		HillStations h1=new HillStations();
		h1.location();
		h1.famousFor();
		
		HillStations m1 = new Manali();
		m1.location();
		m1.famousFor();
		
		HillStations m2= new  Mussoorie();
		m2.location();
		m2.famousFor();
		
		HillStations m3 = new Gulmarg();
		m3.location();
		m3.famousFor();
		
		Manali m4 = new Manali();
		m4.location();
		m4.famousFor();
		
		Mussoorie m5 = new Mussoorie();
		m5.location();
		m5.famousFor();
		
		Gulmarg m6 =new Gulmarg();
		m6.location();
		m6.famousFor();
		
		
	}

}

/* Output:
 
Hill stations are located in mountainous regions.
They are famous for their natural beauty.
Manali is located in Himachal Pradesh.
Manali is famous for snow and adventure sports.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for scenic views and waterfalls.
Gulmarg is located in Jammu & Kashmir.
Gulmarg is famous for skiing and snow-covered mountains.
Manali is located in Himachal Pradesh.
Manali is famous for snow and adventure sports.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for scenic views and waterfalls.
Gulmarg is located in Jammu & Kashmir.
Gulmarg is famous for skiing and snow-covered mountains.

 */

