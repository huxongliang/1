package behavioral.Memento;

public class MementoChess {
	private int x,y;//棋子坐标值
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	private String label;//棋子名称
	
	public MementoChess(String label,int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}
}
