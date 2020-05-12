package structural.Adapter;

//对象模式
public class AdapterClass implements InewJuice {
	private OldJuice oldJuice;

	@Override
	public String NewPort(MyFruit fruit1, MyFruit fruit2) {
		// TODO 自动生成的方法存根
		oldJuice = new OldJuice();
		String str = "混合果汁：" + oldJuice.OnePort(fruit1);
		str += oldJuice.OnePort(fruit2);
		return str;
	}

}
