package figures;

public interface Subject {
	
	default void addSubject(){
  	  System.out.println("Animal Start eating ....");
	}
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
