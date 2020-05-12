package behavioral.strategy;

public class Chef {
	private ICutFruit cutmethod;
	public void SetCutMethod(ICutFruit cutmethod) {
		this.cutmethod =cutmethod;
	}
	
	public void CutFruit(String fruitname) {
		cutmethod.cutStrategy(fruitname);
	}
}
