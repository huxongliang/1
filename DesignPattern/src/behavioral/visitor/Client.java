package behavioral.visitor;

import creational.factory.XMLUtil;

public class Client {
	public static void main(String[] args) {
		//创建商品
		IProduct b1 = new Book();
		IProduct b2 = new Book();
		IProduct a = new Apple();
		//创建访问者
		AVisitor visitor;
		//创建购物车
		BuyBasket buy = new BuyBasket();
		//将商品添加到购物车
		buy.addProduct(a);
		buy.addProduct(b1);
		buy.addProduct(b2);
		//实例化访问者，根据配置文件确定具体访问者
		visitor = (AVisitor) XMLUtil.getBean();
		visitor.setName("王良三");
		//访问购物车
		buy.accept(visitor);
	}
}
