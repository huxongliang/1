package behavioral.observer;

public class StockCommon extends AStockPrice {

	public StockCommon(String code) {
		super(code);
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void notifyHolder() {
		// TODO 自动生成的方法存根
		System.out.println("普通股票更新了-"+code+"："+price1);
		for(StockHolder sh:stockHolderList)
			sh.update(this);
		price2 = price1;
	}

}
