package figures;

public class MainJava06 {

	public static void main(String[] args) {
		Display display = Display.getInstance();

		Point p1 = new Point(10, 10);
		Point p2 = new Point(10, 10);
		Line line = new Line(p1, p2);

		p1.setDisplay(display);
		p2.setDisplay(display);
		line.setDisplay(display);

		System.out.println("Point moves...");
		try {
			p1.setX(11);
			p1.setY(11);
			p2.setX(11);
			p2.setY(11);
		} catch (PointBoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Line moves...");
		try {
			line.moveBy(-20, 20);
		} catch (PointBoundException e) {
			e.printStackTrace();
		}
	}

}
