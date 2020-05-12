package creational.prototype;

public class Client {
	
	public static void main(String[] args) {
		//原型模式浅克隆
//		MyFruit fru1 = new Apple();
//		MyFruit fru2 = (Apple)fru1.clone();
//		
//		fru1.Disply();
//		fru2.Disply();
//		System.out.println("fru1:"+fru1.hashCode());
//		System.out.println("fru2:"+fru2.hashCode());
//		System.out.println(fru1 == fru2);
		
		//复杂对象克隆
		MyFruit fru1 = new Apple();
		MyFruit fru2 = (Apple)fru1.clone();
		MyFruitstore.Add(1, fru1);
		MyFruitstore.Add(2, fru2);
		MyFruitstore.Add(3, new Apple());
		MyFruitstore.Add(4, new Banana());
		
		MyFruit fruit1 = (MyFruit)MyFruitstore.Get(1);
		MyFruit fruit2 = (MyFruit)MyFruitstore.Get(2);
		MyFruit fruit3 = (MyFruit)MyFruitstore.Get(3);
		MyFruit fruit4 = (MyFruit)MyFruitstore.Get(4);
		fruit1.Disply();
		fruit2.Disply();
		fruit3.Disply();
		fruit4.Disply();
	}
}
