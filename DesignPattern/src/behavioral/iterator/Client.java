package behavioral.iterator;

public class Client {
	public static void disply(Television tv) {
	TVIterator i = tv.creatIterator();
	System.out.println("电视频道：");
	while(!i.isLast()) { 
		System.out.println(i.currentChannel());
		System.out.println("-----");
		i.next();
		}
	}
	
	public static void main(String[] args) {
		Television tv  = new TCLTelevision();
		disply(tv);
	}
}