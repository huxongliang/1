package structural.Flyweight;

public class OnePiece extends APiece {

	public OnePiece(String inKind) {
		super(inKind);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void Play(int x, int y) {
		// TODO 自动生成的方法存根
		System.out.println(inKind+"落在("+x+","+y+"）位置");
	}

}
