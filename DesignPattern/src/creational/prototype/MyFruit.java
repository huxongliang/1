package creational.prototype;

public class MyFruit implements Cloneable {
	protected String Kind;
	
	public void Disply() {
		System.out.println(Kind);
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO 自动生成的 catch 
			e.printStackTrace();
		}
		return obj;
	}
}
