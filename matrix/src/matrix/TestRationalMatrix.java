package matrix;

public class TestRationalMatrix extends RationalMatrix{
public static void main(String[] args) {
	String[][] a= {
			{"hello","world","a"},
			{"xiao","ming","b"},
			{"ww","dd","cc"}
			};
	String[][] b={
			{"world","long","qq"},
			{"lang","xin","ww"},
			{"ll","tt","uu"}
			};
	RationalMatrix x=new RationalMatrix();
	x.addMatrix(a,b);
	System.out.println("�������Ϊ��");
	x.printMatrix(a, b, c);
	x.multiplyMatrix(a, b);
	System.out.println("�������Ϊ��");
	x.printMatrix(a, b, d);	
}
}