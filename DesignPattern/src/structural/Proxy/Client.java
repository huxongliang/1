package structural.Proxy;

public class Client {
	public static void main(String[] args) {
		//静态代理
//		CLocalPic pic = new CLocalPic();
//		IShowPic pic = new CLocalPic();//这里推荐用配置文件动态获取类，通过反射运行
//		pic.ShowPic("不屈白银——华贵铂金");
		
		//动态代理
//		IShowPic pic = new CRemoPic();
//		DLocalPic localpic = new DLocalPic(pic);
//		IShowPic photo  = (IShowPic) localpic.getProxyInstance();
//		
//		photo.ShowPic("不屈白银——华贵铂金");
		
		ITestInterface pic = new CTest();
		DLocalPic localpic = new DLocalPic(pic);
		ITestInterface photo  = (ITestInterface) localpic.getProxyInstance();
		photo.sendMessage("穿越火线 ：");
	}
}
