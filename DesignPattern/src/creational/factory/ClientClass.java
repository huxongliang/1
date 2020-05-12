package creational.factory;

public class ClientClass {
	
	public static void main(String[] args) {
//		Factory factory = new Factory();
		//将水果的创建细节在客户端隐藏
		//Factory factory = new BFactory();
		Factory factory = (Factory)XMLUtil.getBean();
		Fruit fruit = factory.CreatFruit();
		fruit.eat();
	}
	
	public String factory(String fruitname) {
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}
}
