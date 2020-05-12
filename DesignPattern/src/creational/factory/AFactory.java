package creational.factory;

public class AFactory extends Factory {
	
	public Fruit CreatFruit() {
		return new Apple();
	}

}
