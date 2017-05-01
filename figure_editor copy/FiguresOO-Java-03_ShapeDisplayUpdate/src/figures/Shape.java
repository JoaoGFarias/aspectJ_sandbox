
package figures;

public abstract class Shape {
	
	private Display display;
	
	protected Display getDisplay(){
		return this.display;
	}
	
	public void setDisplay(Display display){
		this.display = display;
	}

    public abstract void moveBy(int dx, int dy);

}
