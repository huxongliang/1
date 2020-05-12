package creational.abf;

public class BConF implements BFruitandVegetables {
	public Fruit creatF() {
		System.out.print("B:");
		return new Banana();
	}
	public Vegetables creatV() {
		return null;
	}
}
