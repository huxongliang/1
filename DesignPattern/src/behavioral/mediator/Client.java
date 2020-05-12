package behavioral.mediator;

public class Client {
	public static void main(String[] args) {
		AbstractChatroom QQ = new ChatGroup();
		Member member1,member2,member3,member4,member5;
		member1 = new HonorMember("王良三");
		member2 = new CommonMember("笨小孩");
		member3 = new CommonMember("永远的小明");
		member4 = new HonorMember("Apple");
		member5 = new CommonMember("Banana");

		QQ.register(member1);
		QQ.register(member2);
		QQ.register(member3);
		QQ.register(member4);
		QQ.register(member5);
		
		member1.sendText("笨小孩", "早上好啊！");
		member2.sendText("王良三", "早上好啊！");
		member1.sendText("永远的小明", "上号？");
		member2.sendText("王良三", "我上号了");
		member3.sendText("王良三", "不了");
		member4.sendImage("王良三", "你是一条酸菜鱼，又酸又菜又多余");
		member2.sendImage("王良三", "你是一只菜虚鲲，又菜又虚又像鲲");
		member3.sendImage("王良三", "撕少经典语录：如果手上没有剑我,就无法保护你，如果我一直握着剑,我就无法保护你；人蠢不能怪天");
		member1.sendImage("笨小孩", "是的，你们说的都对！");
	}
}
