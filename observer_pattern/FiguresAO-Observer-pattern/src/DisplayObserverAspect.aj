import java.util.Vector;

import figures.Display;
import figures.Shape;
import figures.Point;
import figures.Line;


public aspect DisplayObserverAspect {

	declare parents: Line extends Shape;
	declare parents: Point extends Shape;
	
	private Vector<Display> Shape.observers = new Vector<Display>();

    public void Shape.addObserver(Display s) {
        this.observers.add(s);
    }
    
    public void Shape.removeObserver(Display s) {
        this.observers.remove(s);
    }
    
    public void Shape.updateObserver(Display s) {
        s.update(this);
    }

    pointcut updates(Shape s): target(s) &&
    							(
    								call(void Shape+.moveBy(int, int)) ||
    								call(void Shape+.set*(int || Point))
    							);

    after(Shape s): updates(s){
    	for(Display observer: s.observers){ s.updateObserver(observer);}
    }
	
}