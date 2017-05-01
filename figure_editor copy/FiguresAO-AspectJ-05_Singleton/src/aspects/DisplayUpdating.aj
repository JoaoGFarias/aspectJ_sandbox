package aspects;

import figures.*;

public aspect DisplayUpdating {
//	private Display display = new Display();
	
	// injection of field and methods into Shape
	private Display Shape.display;

	private Display Shape.getDisplay(){
		return this.display;
	}

	public void Shape.setDisplay(Display display){
		this.display = display;
	}

	// Method injection/declaration into Display
	public void Display.update(Shape s) {
		System.out.println("Figure "+s+" updated!!");
	}

	
	pointcut change(): call(public void Shape+.set*(*)) ||
	                   call(public void Shape.moveBy(int, int));
	
	after(Shape obj): change() && !cflowbelow(change())
	                         && target(obj) && !within(DisplayUpdating) {
//		obj.setDisplay(display);
		obj.getDisplay().update(obj);
	}
}