package behavioral.mediator;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {
	
	private Hashtable<Object, behavioral.mediator.Member> members = new Hashtable<Object, behavioral.mediator.Member>();
	
	@Override
	public void sendText(String from, String to,String message) {
		// TODO 自动生成的方法存根
		Member member = members.get(to);
		String newMessage = message;
		newMessage = message.replaceAll("打","*");
		member.receiverText(from,newMessage);
	}

	@Override
	public void sendImage(String from, String to,String image) {
		// TODO 自动生成的方法存根
		Member member = members.get(to);
		if(image.length()>20) {
			System.out.println("图片过大，发送失败");
			System.out.println("The picture is too large, sending failed");
		}else
			member.receiverImage(from, image);
	}

	@Override
	public void register(behavioral.mediator.Member member) {
		// TODO 自动生成的方法存根
		if(!members.contains(member)) {
			members.put(member.getName(), member);
			member.setChatroom(this);
		}
	}


}
