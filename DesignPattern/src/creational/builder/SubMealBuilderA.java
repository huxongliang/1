package creational.builder;

public class SubMealBuilderA extends MealBuilder {

	@Override
	public void buildfood() {
		// TODO 自动生成的方法存根
		meal.setFood("一个鸡腿堡");
	}

	@Override
	public void builddrink() {
		// TODO 自动生成的方法存根
		meal.setDrink("一杯可乐");
	}

}
