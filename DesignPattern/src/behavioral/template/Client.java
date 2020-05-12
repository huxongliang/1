package behavioral.template;

public class Client {
	public static void main(String[] args) {
		ADefiniteIntegral[] adf = new ADefiniteIntegral[2];
		adf[0] = new DefIntegralXX(0,20,1000);
		adf[1] = new DefIntegralLn(1,20,1000);
		System.out.println(adf[0].CalDefiniteIntegral());
		System.out.println(adf[1].CalDefiniteIntegral());
	}
}
