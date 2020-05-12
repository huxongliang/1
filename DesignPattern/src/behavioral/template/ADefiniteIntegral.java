package behavioral.template;

public abstract class ADefiniteIntegral {
	abstract protected double geta();//得到下限
	abstract protected double getb();//得到上限
	abstract protected int getc();//切分区间个数
	abstract protected double function(double x);//积分函数f(x)
	
	public final double CalDefiniteIntegral() {
		double a,b,t,sum = 0;
		int c = 0;
		//得到上下限
		a = geta();
		b = getb();
		//得到份额即区间共分为几分
		c = getc();
		//确保a<=b
		if(a>b) {
			t = a;
			a = b;
			b = t;
		}
		//计算一份长度
		t = (b-a)/(double)c;
		//
		for(int i = 1;i<=c;i++) {
			sum = sum +  t*function(a+(i-1)*t);
		}
		return sum;
	}
}
