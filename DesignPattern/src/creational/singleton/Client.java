package creational.singleton;

public class Client {
	
	public static void main(String[] args) {
		MyFruitstore mfs1 = MyFruitstore.Getfruitstore();
		MyFruit fru1 = new Apple();
		MyFruit fru2 = (Apple)fru1.clone();
		mfs1.Add(1, fru1);
		mfs1.Add(2, fru2);
		mfs1.Add(3, new Apple());
		mfs1.Add(4, new Banana());
		MyFruitstore mfs2 = MyFruitstore.Getfruitstore();
		
		MyFruit fruit = mfs1.Get(4);
		fruit.Disply();
		System.out.println("mfs1:"+mfs1.toString());
		System.out.println("mfs2:"+mfs2.toString());

	}
}
