package structural.Bridge;

public class BigPen extends Pen {

	@Override
	public void draw(String name) {
		// TODO 自动生成的方法存根
		String penType = "大号毛笔绘制";
		this.color.bepaint(penType, name);
	}

}
