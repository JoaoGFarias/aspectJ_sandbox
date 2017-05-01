package aspects;

import figures.*;

public aspect DisplayUpdating {
	
	pointcut change(): call(public void Shape+.set*(*)) ||
	                   call(public void Shape.moveBy(int, int));
	
	after(Shape obj): change() && !cflowbelow(change())
	                         && target(obj) {
		Display.update(obj);
	}
}
