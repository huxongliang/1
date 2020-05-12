package behavioral.State;

public class Client {
	public static void main(String[] args) {
		ThreadContext tc = new ThreadContext();
		tc.start();
		tc.getCPU();
		tc.stop();
//		tc.suspend();
	}
}
