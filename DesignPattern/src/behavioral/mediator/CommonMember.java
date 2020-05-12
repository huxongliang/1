package behavioral.mediator;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void sendText(String to, String message) {
		// TODO 自动生成的方法存根
		System.out.print("普通用户发送消息：");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		// TODO 自动生成的方法存根
		System.out.print("普通用户禁止发送图片，如有需要，请你开通荣耀会员（不充钱怎么变强？）");
	}

}
