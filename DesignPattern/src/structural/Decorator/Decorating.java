package structural.Decorator;

public class Decorating implements IBirthdayCake {
	private IBirthdayCake birthdayCake;
	
	public Decorating(IBirthdayCake birthdayCake) {
		this.birthdayCake = birthdayCake;
	}
	
	@Override
	public void show() {
		// TODO 自动生成的方法存根
		birthdayCake.show();
	}

}
