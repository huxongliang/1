package compare;

public class abc {
	static String[] dir = {"abc","def","ghi","123","456","789"};
	public static void main(String[] args) {
		long time1=System.currentTimeMillis();
		String stringTest=new String();
		StringBuilder sbTest=new StringBuilder();
		for(int i=0;i<1000;i++);{
		for(String string : dir) {
			stringTest +=string;
		}
	}
	
	long time2 =System.currentTimeMillis();
	for(int i=0;i<1000;i++);{
	for(String string : dir) {
		sbTest.append(string);
		}
}
	long endtime = System.currentTimeMillis();
	System.out.println("String��ʱ:"+(time2-time1)+"����");
	System.out.println("StringBuilder��ʱ:"+(endtime-time2)+"����");
	}
}