package behavioral.visitor;

public class Saler extends AVisitor {

	@Override
	public void visit(Apple apple) {
		// TODO 自动生成的方法存根
		System.out.println("收银员"+name+"给苹果过称，然后计算价格");
	}

	@Override
	public void visit(Book book) {
		// TODO 自动生成的方法存根
		System.out.println("收银员"+name+"直接计算书的价格");
	}

}
