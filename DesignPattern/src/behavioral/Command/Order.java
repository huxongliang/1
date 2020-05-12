package behavioral.Command;

import java.util.HashMap;

public class Order {
	private int ID;
	private HashMap<String,Integer> fruitMenu;
	
	public Order() {
		fruitMenu = new HashMap<String, Integer>();
	}
	
	public int getID() {
		// TODO 自动生成的方法存根
		return ID;
	}
	
	public void setID(int iD) {
		this.ID = iD;
	}
	
	public HashMap<String,Integer> getFruitMenu() {
		return fruitMenu;
	}
	
	public void setFruitMenu(String fruitname,Integer quantity) {
		this.fruitMenu.put(fruitname, quantity);
	}

}
