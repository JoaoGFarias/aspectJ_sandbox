
package figures;

import java.util.ArrayList;
import java.util.List;

public class Line implements Shape, Subject {
	private Point p1, p2;
	private List<Observer> observers;

	Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.observers = new ArrayList<Observer>();
	}

	public Point getP1() { return p1; }
	public Point getP2() { return p2; }

	public void setP1(Point p1) { 
		this.p1 = p1; 
		this.notifyObservers();
	}
	
	public void setP2(Point p2) { 
		this.p2 = p2; 
		this.notifyObservers();
	}

	public void moveBy(int dx, int dy) {
		getP1().moveBy(dx, dy);
		getP2().moveBy(dx, dy);
		this.notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this);
		}
	}
}
