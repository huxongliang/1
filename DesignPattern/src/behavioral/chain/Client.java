package behavioral.chain;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		//创建三个分拣器
		AbstractFruitSort Bfs,Mfs,Sfs;
		Bfs = new BigFruitSorting(9);
		Mfs = new MidFruitSorting(5);
		Sfs = new SmallFruitSorting(2);
		
		//设计职责链
		Bfs.setNextSort(Mfs);
		Mfs.setNextSort(Sfs);
		//放入水果
		Random rm = new Random();
		for(int i =0;i<1000;i++) {
			int weight = rm.nextInt(10);
			Bfs.sendFruit(weight, "草莓");
		}
		//输出分拣器情况
		Bfs.getFruitBox();
		Mfs.getFruitBox();
		Sfs.getFruitBox();
	}
}
