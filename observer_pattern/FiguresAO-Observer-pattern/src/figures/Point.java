
package figures;

import java.util.ArrayList;
import java.util.List;

public class Point implements Shape, Subject {
	private int x = 0, y = 0;
	private List<Observer> observers;

	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.observers = new ArrayList<Observer>();
	}

	public int getX() { return x; }
	public int getY() { return y; }

	public void setX(int x) { 
		this.x = x; 
		this.notifyObservers();
	}
	public void setY(int y) { 
		this.y = y; 
		this.notifyObservers();
	}

	public void moveBy(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
		this.notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
		if(i >= 0){
			this.observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < this.observers.size(); i++) {
			Observer observer = this.observers.get(i);
			observer.update(this);
		}
	}
	
	public void test(){
		System.out.println("TESTE");
	}
}
