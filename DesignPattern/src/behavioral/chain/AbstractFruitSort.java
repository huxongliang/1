package behavioral.chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
	private int weight;//重量
	protected List<String> fruitBox;//漏斗（处理水果）
	private AbstractFruitSort next;//如果处理不了，则移交给下一个处理
	
	public void getFruitBox() {
		System.out.println("分拣器处理的重量："+weight);
		System.out.println("分拣器处理的水果数："+fruitBox.size());
		System.out.println("分拣器处理的水果：");
		for(String fruit:fruitBox)//遍历出漏斗里所有的水果
			System.out.print(fruit+", " );
		System.out.println(" ");
	}
	
	public void setNextSort(AbstractFruitSort next) {
		this.next = next;
	}
	
	public AbstractFruitSort(int weight) {
		this.weight = weight;
		fruitBox = new ArrayList<String>();
	}
	
	public void sendFruit(int weight,String fruit) {
//		if(this.weight == weight)
		if(this.weight <= weight)//如果水果重量大于分拣器处理重量，就放入进来
			pushBox(fruit);//分拣器处理方法设计为抽象函数，由子类实现
		else 
			if(next != null)
				next.sendFruit(weight, fruit);
	}

	protected abstract void pushBox(String fruit);

}
