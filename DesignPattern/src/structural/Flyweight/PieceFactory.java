package structural.Flyweight;

import java.util.HashMap;

public class PieceFactory {
	private HashMap<String, APiece>  piecePool = new HashMap<String, APiece>();
	
	public APiece GetPiece(String key) {
		if(!piecePool.containsKey(key)) {
			APiece piece = new OnePiece(key);
			piecePool.put(key,piece);
			return piece;
		}else
			return  piecePool.get(key);
	}
	
	public int GetPieceCount() {
		return piecePool.size();
	}
}
