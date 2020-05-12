package structural.Adapter;

//类模式
public class OldJuice {
	public String OnePort(MyFruit fruit) {
		String str = fruit.get()+"果汁";
		return str;
	}
}
