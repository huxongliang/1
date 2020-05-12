package structural.Facade;

public class Light {
	private String position;
	
	public Light(String position) {
		this.position = position;
	}
	
	public void on() {
		System.out.println("Light"+position+": "+"开启");
	}
	
	public void off() {
		System.out.println("Light"+position+": "+"关闭");
	}
}
