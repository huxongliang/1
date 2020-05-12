package creational.builder;

public class SubMealBuilderB extends MealBuilder {

	@Override
	public void buildfood() {
		// TODO 自动生成的方法存根
		meal.setFood("一个汉堡包");
	}

	@Override
	public void builddrink() {
		// TODO 自动生成的方法存根
		meal.setDrink("一杯肥宅快乐水");
	}

}
