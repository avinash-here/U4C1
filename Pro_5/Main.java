package Pro_5;

public class Main {
	
	public static void main(String[] args) {
		
		Shapes shapes = new Shapes();
		
		shapes.area(new Circle());
		shapes.area(new Rectangle());
		shapes.area(new Square());
		
		
		//Polymorphism -
		//When there are two or more methods with same variable but different parameters,
		//then if we call that method with a parameter, the method that has the nearest parameter 
		// to the caller, will get called. That's the example of polymorphism.
	}

}
