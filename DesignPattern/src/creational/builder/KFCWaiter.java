package creational.builder;

public class KFCWaiter {
	private MealBuilder mb;
	public void setMealBuilder(MealBuilder mb) {
		this.mb = mb;
	}
	public Meal construct() {
		mb.buildfood();
		mb.builddrink();
		return mb.getMeal();
	}
}
