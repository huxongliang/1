package creational.factory;

public class Factory {
	//构造一个水果工厂
	//将类的创建与实现分离我
	//简单工厂模式下如果需要增加新的水果产品，则需要修改CreatFruit方法，违背了开闭原则
//	public Fruit CreatFruit(String Kind) {
//		if(Kind.equals("A"))
//			return new Apple();
//		if(Kind.equals("B"))
//			return new Banana();
//		return null;
//	}
	
	public Fruit CreatFruit() {
		return null;
	}

}
