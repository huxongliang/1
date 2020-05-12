package structural.Composite;

import java.util.ArrayList;

public class Plate extends MyElement {
	
	private ArrayList<MyElement> list = new ArrayList<MyElement>();

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		//层层嵌套，盘子可以装盘子，也可以装水果
		for(Object object:list) {
			((MyElement)object).eat();
		}
	}
	
	public void add(MyElement myelement) {
		list.add(myelement);
	}
	
	public void delete(MyElement myelement) {
		list.remove(myelement);
	}

}
