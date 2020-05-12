package behavioral.mediator;

public abstract class Member {
	protected AbstractChatroom chatroom;
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		// TODO 自动生成的方法存根
		return name;
	}

	public void setChatroom(ChatGroup chatroom) {
		// TODO 自动生成的方法存根
		this.chatroom = chatroom;
	}

	public void receiverText(String from, String Message) {
		// TODO 自动生成的方法存根
		System.out.println(from+"发送文本给"+this.name+":"+Message);
	}

	public void receiverImage(String from, String image) {
		// TODO 自动生成的方法存根
		System.out.println(from+"发送图片给"+this.name+":"+image);
	}
	
	public abstract void sendText(String to,String message);
	public abstract void sendImage(String to,String image);

}
