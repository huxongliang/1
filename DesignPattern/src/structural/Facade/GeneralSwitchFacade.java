package structural.Facade;

public class GeneralSwitchFacade {
	private Light light[] = new Light[4];
	private Fan fan;
	private AirConditioner air;
	private Television tel;
	
	public GeneralSwitchFacade() {
		light[0] = new Light("左前");
		light[1] = new Light("左后");
		light[2] = new Light("右前");
		light[3] = new Light("右前");
		fan = new Fan();
		air = new AirConditioner();
		tel = new Television();
	}
	
	public void on() {
		//外观对象并不提供开启功能，而是由对应的类实现
		light[0].on();
		light[1].on();
		light[2].on();
		light[3].on();
		fan.on();
		air.on();
		tel.on();
	}
	
	public void off() {
		//外观对象并不提供关闭功能，而是由对应的类实现
		light[0].off();
		light[1].off();
		light[2].off();
		light[3].off();
		fan.off();
		air.off();
		tel.off();
	}
}
