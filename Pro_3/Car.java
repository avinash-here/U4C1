package Pro_3;

public class Car {
	
	String model;
	String companyName;
	String color;
	Engine engine;
	
	
	public Car() {}
	
	public Car(String model,String companyName, String color, Engine engine) {
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}
	
	
	public static void main(String[] args) {		
		
		Engine engine1 = new Engine();
		
		Engine engine2 = new Engine();
		engine2.rpm = 100;
		engine2.power = 600;
		engine2.manufacturer = "TATA";
		engine2.enableTurbo();
		
		Car car1 = new Car();
		car1.engine = engine1;
		
		Car car2 = new Car("Range Rover", "Land Rover", "grey", engine2);
		
		System.out.println("Car 1 Details :");
		System.out.println("Car Model : "+car1.model);
		System.out.println("Car Company Name : "+car1.companyName);
		System.out.println("Car Color : "+car1.color);
		System.out.println("Car RPM : "+car1.engine.rpm);
		System.out.println("Car Power : "+car1.engine.power);
		System.out.println("Car Engine Manufacturer: "+car1.engine.manufacturer);
		System.out.println("Car Has Turbo : "+car1.engine.hasTurbo);
		
		System.out.println("<==========================>");
		
		System.out.println("Car 2 Details :");
		System.out.println("Car Model : "+car2.model);
		System.out.println("Car Company Name : "+car2.companyName);
		System.out.println("Car Color : "+car2.color);
		System.out.println("Car RPM : "+car2.engine.rpm);
		System.out.println("Car Power : "+car2.engine.power);
		System.out.println("Car Engine Manufacturer: "+car2.engine.manufacturer);
		System.out.println("Car Has Turbo : "+car2.engine.hasTurbo);
		
				
	}

}
