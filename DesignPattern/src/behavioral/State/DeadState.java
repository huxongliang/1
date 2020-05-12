package behavioral.State;

public class DeadState extends ThreadState {
	public DeadState() {
		this.state = StateSet.DEAD;
		System.out.println("线程死亡");
	}
}
