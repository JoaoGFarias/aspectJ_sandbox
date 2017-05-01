
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

	public void setX(int x) throws PointBoundException{
		if(x < 0){
			throw new PointBoundException("X coordinate must be positive!");
		}
		this.x = x; 
		this.getDisplay().update(this);
	}
	public void setY(int y) throws PointBoundException{ 
		if(y < 0){
			throw new PointBoundException("Y coordinate must be positive!");
		}
		this.y = y; 
		this.getDisplay().update(this);
	}

	public void moveBy(int dx, int dy) throws PointBoundException {
		setX(getX() + dx);
		setY(getY() + dy);
		this.getDisplay().update(this);
	}
}
