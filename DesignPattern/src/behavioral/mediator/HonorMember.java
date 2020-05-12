package behavioral.mediator;

public class HonorMember extends Member {

	public HonorMember(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void sendText(String to, String message) {
		// TODO 自动生成的方法存根
		System.out.print("荣耀会员发送消息：");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		// TODO 自动生成的方法存根
		System.out.print("荣耀会员发送图片：");
		chatroom.sendText(name, to, image);
	}

}
