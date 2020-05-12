package behavioral.interpreter;

public class Client {
	//规定莫凡、王良三都是男性
	public static Expression getMaleExpressin() {
		Expression WangLiangsan = new TerminalExpression("Wang Liangsan");
		Expression Mofan = new TerminalExpression("Mofan");
		return new OrExpression(WangLiangsan,Mofan);
	}
	
	//规定苏莉娅已婚
	public static Expression getMarriedWomanExpression() {
		Expression Surya = new TerminalExpression("Married");
		Expression Married = new TerminalExpression("Married");
		return new AndExpression(Surya,Married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpressin();
		Expression isMarriedWoman = getMarriedWomanExpression();
		System.out.println("Wang Liangsan是男人否？"+isMale.interpret("Wang Liangsan"));
		System.out.println("is Surya Married？"+isMarriedWoman.interpret("Married"));
	}
}
