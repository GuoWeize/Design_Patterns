package 观察者模式;

public interface Subject {
	public void register (Observer observer);
	public void remove (Observer observer);
	public void notifyObservers ();
}
