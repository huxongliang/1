package structural.Facade;

public class Client {
	public static void main(String[] args) {
		GeneralSwitchFacade mfs = new GeneralSwitchFacade();
		mfs.on();
		System.out.println("------------------");
		mfs.off();
	}
}
