package behavioral.Command;

import java.util.ArrayList;

public class WaiterInvoke {
	private ArrayList<Command> commands;//订单列表，记录订单本子
	
	public WaiterInvoke() {
		commands = new ArrayList<Command>();
	}
	
	//添加订单
	public void setCommand(Command command) {
		commands.add(command);
	}
	
	//不知道订单具体对象，所以使用抽象接口执行方法
	public void OrderUp() {
		System.out.println("主人，你有新的订单，请查收！");
		for(Command command:commands) {
			if(command!=null)
			command.excute();
		}
	}
}
