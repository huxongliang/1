package behavioral.State;

public class ThreadContext {
	private ThreadState threadState;
	
	public ThreadContext() {
		threadState  = new NewState();
	}

	public void setThreadState(ThreadState threadState) {
		// TODO 自动生成的方法存根
		this.threadState = threadState;
	}
	
	public void start() {
		((NewState)threadState).start(this);
	}
	
	public void getCPU() {
		((RunnableState)threadState).getCPU(this);
	}
	
	public void suspend() {
		((RunningState)threadState).suspend(this);
	}
	
	public void resume() {
		((BlockedState)threadState).resume(this);
	}
	
	public void stop() {
		((RunningState)threadState).stop(this);
	}
}
