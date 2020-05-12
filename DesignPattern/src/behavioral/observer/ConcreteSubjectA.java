package behavioral.observer;

public class ConcreteSubjectA extends SubjectS {
	public ConcreteSubjectA() {
		super();
	}

	@Override
	void NotifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("A目标发生改变");
		for(Observer observer:observers)
			observer.response();
	}
}
