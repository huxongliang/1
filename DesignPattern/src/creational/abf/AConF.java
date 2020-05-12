package creational.abf;

public class AConF implements AFruitandVegetables {
	
	public Fruit creatF() {
		System.out.print("A:");
		return new Apple();
	}
	public Vegetables creatV() {
		return null;
	}

}
