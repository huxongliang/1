package behavioral.observer;

public class Client {
	public static void main(String[] args) {
		//简单观察者模式
//		SubjectS subject = new ConcreteSubjectB();
//		Observer obsA = new ConcreteObserver1();
//		Observer obsB = new ConcreteObserver2();
//		subject.Add(obsA);
//		subject.Add(obsB);
//		subject.NotifyObserver();
		
		//股票观察者
		AStockPrice futures1 = new StockFutures("橙橙橙");
		AStockPrice futures2 = new StockFutures("龙龙龙");
		AStockPrice futures3 = new StockFutures("菜菜菜");
		
		AStockPrice common4 = new StockCommon("旺旺旺");
		AStockPrice common5 = new StockCommon("木木木");
		AStockPrice common6 = new StockCommon("雨雨雨");
		
		StockHolder Buy1 = new BuyHolder("Buy1");
		StockHolder Buy2 = new BuyHolder("Buy2");
		StockHolder Buy3 = new BuyHolder("Buy3");
		StockHolder sell1 = new SellHolder("sell1");
		StockHolder sell2 = new SellHolder("sell2");
		StockHolder sell3 = new SellHolder("sell3");
		
		Buy1.AddHolder(futures1);
		Buy1.AddHolder(futures2);
		Buy1.AddHolder(common4);
		
		Buy2.AddHolder(futures1);
		Buy2.AddHolder(futures3);
		Buy2.AddHolder(common6);
		
		Buy3.AddHolder(futures2);
		Buy3.AddHolder(futures3);
		Buy3.AddHolder(common6);
		
		sell1.AddHolder(futures1);
		sell1.AddHolder(common5);
		sell1.AddHolder(common6);
		
		sell2.AddHolder(futures1);
		sell2.AddHolder(futures2);
		sell2.AddHolder(common5);
		
		sell3.AddHolder(futures1);
		sell3.AddHolder(common4);
		sell3.AddHolder(common5);
		
		for(int i=0;i>-5;i--) {
			futures1.setPrice(1+i);
			futures2.setPrice(1+i);
			futures3.setPrice(1+i);
			
			common4.setPrice(1+i);
			common5.setPrice(1+i);
			common6.setPrice(1+i);
		}
	}
}
