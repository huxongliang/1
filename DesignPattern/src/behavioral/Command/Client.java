package behavioral.Command;

public class Client {
	public static void main(String[] args) {
		//创建多个订单
		Order order = new Order();
		order.setID(1);
		order.setFruitMenu("魔鬼椒", 2);
		order.setFruitMenu("火参果", 1);
		order.setFruitMenu("雪莲果", 3);
		
		Order order2 = new Order();
		order2.setID(2);
		order2.setFruitMenu("蛋黄果", 2);
		order2.setFruitMenu("牛油果", 1);
		order2.setFruitMenu("榴莲", 3);
		//创建操作者
		Operator receiver = new Operator();
		//将多个订单封装成命令对象
		ConcreteCommand commands = new ConcreteCommand(receiver,order);
		ConcreteCommand commands2 = new ConcreteCommand(receiver,order2);
		//创建调用者并加载命令
		WaiterInvoke invoke = new WaiterInvoke();
		invoke.setCommand(commands);
		invoke.setCommand(commands2);
		//执行命令
		invoke.OrderUp();
	}
}
