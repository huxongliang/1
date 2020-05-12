package structural.Proxy;

public class CTest implements ITestInterface {

	@Override
	public void sendMessage(String msg) {
		// TODO 自动生成的方法存根
		for(int i = 10;i>0;i--) {
			System.out.println(msg+"距离幽灵出现还有"+i+"秒");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println("叮        幽灵已出现！");
	}

}
