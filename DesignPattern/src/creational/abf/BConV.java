package creational.abf;

public class BConV implements BFruitandVegetables {

	public Fruit creatF() {
		return null;
	}
	public Vegetables creatV() {
		System.out.print("B:");
		return new Tomato();
	}
}
