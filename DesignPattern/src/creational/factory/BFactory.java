package creational.factory;

public class BFactory extends Factory {

	public Fruit CreatFruit() {
		return new Banana();
	}

}
