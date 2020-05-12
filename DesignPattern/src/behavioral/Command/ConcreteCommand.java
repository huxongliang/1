package behavioral.Command;

public class ConcreteCommand implements Command {
	private Operator receiver;//执行者
	private Order order;//执行的目标

	public ConcreteCommand(Operator receiver,Order order) {
		this.receiver = receiver;
		this.order = order;
	}
	
	@Override 
	public void excute() {
		// TODO 自动生成的方法存根
		System.out.println(order.getID()+"号顾客的订单");
		receiver.MarkFruit(order);//完成榨果机操作
	}

}
