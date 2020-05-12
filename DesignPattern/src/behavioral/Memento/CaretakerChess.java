package behavioral.Memento;

import java.util.ArrayList;

public class CaretakerChess {
	private ArrayList<MementoChess> memlist = new ArrayList<MementoChess>();
	
	public void AddMem(MementoChess mem) {
		memlist.add(mem);
	}
	
	public MementoChess getMem(int i) {
		return (MementoChess) memlist.get(i);
	}
}
