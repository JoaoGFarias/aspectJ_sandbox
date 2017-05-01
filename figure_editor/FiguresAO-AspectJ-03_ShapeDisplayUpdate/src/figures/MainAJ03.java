package figures;

public class MainAJ03 {

	public static void main(String[] args) {
		Display display = new Display();

		Point p1 = new Point(10, 10);
		Point p2 = new Point(10, 10);
		Line line = new Line(p1, p2);

		p1.setDisplay(display);
		p2.setDisplay(display);
		line.setDisplay(display);

		System.out.println("Point moves...");
		p1.setX(11);
		p1.setY(11);
		p2.setX(11);
		p2.setY(11);
		System.out.println();
		System.out.println("Line moves...");
		line.moveBy(20, 20);
	}

}
