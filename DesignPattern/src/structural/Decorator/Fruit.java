package structural.Decorator;

public class Fruit extends Decorating {
	
	public void PutFruit() {
		System.out.println("Put Fruit ...");
	}
	
	public Fruit(IBirthdayCake birthdayCake) {
		super(birthdayCake);
	}
}
