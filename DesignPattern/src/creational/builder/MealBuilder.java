package creational.builder;

public abstract class MealBuilder {
	protected Meal meal = new Meal();
	public abstract void  buildfood();
	public abstract void  builddrink();
	public Meal getMeal() {
		return meal;
	}
}
