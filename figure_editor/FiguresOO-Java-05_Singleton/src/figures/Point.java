
package figures;

public class Point extends Shape {
	private int x = 0, y = 0;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() { return x; }
	public int getY() { return y; }

	public void setX(int x) {
		this.x = x; 
		this.getDisplay().update(this);
	}
	public void setY(int y) { 
		this.y = y; 
		this.getDisplay().update(this);
	}

	public void moveBy(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
		this.getDisplay().update(this);
	}
}
