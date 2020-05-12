package structural.Bridge;

public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		// TODO 自动生成的方法存根
		String penType = "中号毛笔绘制";
		this.color.bepaint(penType, name);
	}

}
