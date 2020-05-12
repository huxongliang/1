package behavioral.Command;

public class Operator {

	public void MarkFruit(Order order) {
		// TODO 自动生成的方法存根
		String str = "";
		for(String fruit:order.getFruitMenu().keySet()) {
			str += fruit+order.getFruitMenu().get(fruit).toString();
		}
		System.out.println("这东西真的可以喝吗："+str);
	}

}
