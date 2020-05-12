package behavioral.State;

public class BlockedState extends ThreadState {
	public BlockedState() {
		this.state = StateSet.BLOCK;
		System.out.println("阻塞线程");
	}
	
	public void resume(ThreadContext tc) {
		System.out.println("调用了resume方法");
		if(state == StateSet.BLOCK)
			tc.setThreadState(new RunnableState());
		else
			System.out.println("当前状态不是阻塞状态");
	}
}
