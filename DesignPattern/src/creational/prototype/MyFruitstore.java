package creational.prototype;

import java.util.Hashtable;

public class MyFruitstore {
	private static Hashtable<Integer, MyFruit> fruittable = new Hashtable<Integer,MyFruit>(); 
	
	public static void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);
	}
	
	public static MyFruit Get(Integer key) {
		MyFruit fruit = (MyFruit)fruittable.get(key);
		//这里返回的是克隆之后的对象,fruittable相当于游戏商店，里面存放的商品都是样品，看起来似乎只有一件
		//但玩家们可以无限购买，因为购买的并不是这件样品，而是这件样品克隆后的对象
		return (MyFruit) fruit.clone();
	}
}
