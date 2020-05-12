package behavioral.observer;

public class ConcreteSubjectB extends SubjectS {
	public ConcreteSubjectB() {
		super();
	}

	@Override
	void NotifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("B目标发生改变");
		for(Observer observer:observers)
			observer.response();
	}

}
