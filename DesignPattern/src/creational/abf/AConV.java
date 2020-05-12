package creational.abf;

public class AConV implements AFruitandVegetables {
	public Fruit creatF() {
		return null;
	}
	public Vegetables creatV() {
		System.out.print("A:");
		return new Cabbage();
	}
}
