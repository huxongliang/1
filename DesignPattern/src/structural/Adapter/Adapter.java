package structural.Adapter;

public class Adapter extends OldJuice implements InewJuice {

	@Override
	public String NewPort(MyFruit fruit1, MyFruit fruit2) {
		// TODO 自动生成的方法存根
		String str = "混合果汁："+OnePort(fruit1);
		str+= OnePort(fruit2);
		return str;
	}
	
}
