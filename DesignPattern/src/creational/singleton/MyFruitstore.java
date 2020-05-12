package creational.singleton;

import java.util.Hashtable;

public class MyFruitstore {
	//private static Hashtable fruittable = new Hashtable<Integer,MyFruit>(); 
	private static Hashtable<Integer, MyFruit> fruittable = null; 
	private static MyFruitstore furitstore = null;
	
	private MyFruitstore() {
		fruittable = new Hashtable<Integer,MyFruit>();
	}
	
	public static MyFruitstore Getfruitstore() {
		if(furitstore == null)
			furitstore = new MyFruitstore();
		return furitstore;
	}
	public void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);
	}
	
	public MyFruit Get(Integer key) {
		MyFruit fruit = (MyFruit)fruittable.get(key);
		//这里返回的是克隆之后的对象,fruittable相当于游戏商店，里面存放的商品都是样品，看起来似乎只有一件
		//但玩家们可以无限购买，因为购买的并不是这件样品，而是这件样品克隆后的对象
		return (MyFruit) fruit.clone();
	}
}
