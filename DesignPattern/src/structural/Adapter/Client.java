package structural.Adapter;

public class Client {
	public static void main(String[] args) {
		//类模式
		MyFruit fruit1 = new MyFruit();
		MyFruit fruit2 = new MyFruit();
		fruit1.set("Apple");
		fruit2.set("Banana");
		InewJuice newjuice = new Adapter();
		System.out.println(newjuice.NewPort(fruit1,fruit2));
		
		//对象模式
		MyFruit fruit3 = new MyFruit();
		MyFruit fruit4 = new MyFruit();
		fruit3.set("strawberries");
		fruit4.set("cherry ");
		InewJuice newjuice2 = new AdapterClass();
		System.out.println(newjuice2.NewPort(fruit3,fruit4));
	}
}
