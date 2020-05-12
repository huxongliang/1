package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements StockHolder {
	private List<AStockPrice> attentionlist;
	private String name;
	
	public BuyHolder(String name) {
		this.name = name;
		attentionlist = new ArrayList<AStockPrice>();
	}
	
	@Override
	public void update(AStockPrice asp) {
		// TODO 自动生成的方法存根
		if(attentionlist.contains(asp)) {
			System.out.println(name);
			if(asp.getPrice()-asp.getPrice2()>0) {
				System.out.print(asp.code+":");
				System.out.print("原价："+asp.getPrice2()+"-现价"+asp.getPrice());
				System.out.println("涨了涨了,舒服了舒服了");
			}else {
				System.out.print(asp.code+":");
				System.out.print("原价："+asp.price2+"-现价"+asp.getPrice());
				System.out.println("跌了,一场突如其来的意外使本就不富裕的我雪上加霜");
			}
		}
	}

	@Override
	public void AddHolder(AStockPrice asp) {
		// TODO 自动生成的方法存根
		attentionlist.add(asp);
		asp.add(this);
	}
	
	public void Renmove(AStockPrice asp) {
		attentionlist.remove(asp);
		asp.remove(this);
	}

}
