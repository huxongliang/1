package structural.Decorator;

public class Client {
	public static void main(String[] args) {
		IBirthdayCake birthdayCake = new Cake();
		birthdayCake.show();
		Fruit fruit = new Fruit(birthdayCake);
		fruit.PutFruit();
		Cream cream = new Cream(fruit);
		cream.PutCream();
		cream.show();
	}
}
