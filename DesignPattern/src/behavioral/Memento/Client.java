package behavioral.Memento;

public class Client {
	private static int index = 0;
	private static CaretakerChess caretaker = new CaretakerChess();
	
	public static void play(OriginatorChess chess) {
		// TODO 自动生成的方法存根
		index++;
		caretaker.AddMem(chess.SaveToMemento());
		chess.Show();
	}
	
	public static void undo(OriginatorChess chess, int i) {
		// TODO 自动生成的方法存根
		System.out.println("---------悔棋（不悔不是人系列）---------");
		index--;
		chess.Restore(caretaker.getMem(index - 1));
		chess.Show();
	}

	public static void redo(OriginatorChess chess, int i) {
		// TODO 自动生成的方法存根
		System.out.println("---------撤销悔棋（举棋不悔大丈夫）---------");
		chess.Restore(caretaker.getMem(index));
		index++;
		chess.Show();
	}
	
	public static void main(String[] args) {
		OriginatorChess chess = new OriginatorChess(
				new MementoChess("白棋",1,2));
		play(chess);
		chess.setX(3);
		play(chess);
		chess.setY(6);
		play(chess);
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
	}
}
