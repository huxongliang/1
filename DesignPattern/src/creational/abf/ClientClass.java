package creational.abf;

public class ClientClass {
	public static void main(String[] args) {
		AFruitandVegetables aFandV = new AConF();
		Fruit Afruit = aFandV.creatF();
		Afruit.eat();
		AFruitandVegetables aFandV1 = new AConV();
		Vegetables Avegetab = aFandV1.creatV();
		Avegetab.eat();
		BFruitandVegetables bFandV = new BConF();
		Fruit Bfruit = bFandV.creatF();
		Bfruit.eat();
		BFruitandVegetables bFandV1 = new BConV();
		Vegetables Bvegetab = bFandV1.creatV();
		Bvegetab.eat();
	}
}
