package 最终模式_复合模式;

public interface QuackObservable {
	public void register (Observer observer);
	public void notifyObservers ();
}
