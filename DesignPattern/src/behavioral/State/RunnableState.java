package behavioral.State;

public class RunnableState extends ThreadState {
	public RunnableState() {
		this.state = StateSet.RUNNABLE;
		System.out.println("就绪状态");
	}
	
	public void getCPU(ThreadContext tc) {
		System.out.println("获得CPU时间");
		if(state == StateSet.RUNNABLE)
			tc.setThreadState(new RunningState());
		else
			System.out.println("当前状态不是就绪状态");
	}
}
