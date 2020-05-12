package structural.Flyweight;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random rm = new Random();
		PieceFactory pFactory = new PieceFactory();
		for(int i=1;i<19;i++)
			for(int j=1;j<19;j++){
				APiece p;
				if(rm.nextInt()%2==0)
					p = pFactory.GetPiece("白棋");
				else 
					p = pFactory.GetPiece("黑棋");
				p.Play(rm.nextInt(19),rm.nextInt(19));
			}
		//实际上对象只有2个，所有棋子只是共享这两个对象，区别（外部状态）在于x,y不同
		System.out.println("总共棋子对象个数为： "+pFactory.GetPieceCount());
	}
}
