package behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		Chef chef = new Chef();
		ICutFruit icf = new MultiBlade();
		chef.SetCutMethod(icf);
		chef.CutFruit("苹果");
	}
}
