package figures;

public class MainObserverPattern {

	public static void main(String[] args) {
		// Creating points and a line
		Point p1 = new Point(10, 10);
		Point p2 = new Point(10, 10);
		Line line = new Line(p1, p2);
		
		// Creating a display
		Display display = new Display();
		display.addSubject(p1);
		display.addSubject(p2);
		display.addSubject(line);
		
		// Creating a second display
//		Display display2 = new Display();
//		display2.addSubject(p1);
//		display2.addSubject(p2);
//		display2.addSubject(line);

		System.out.println("Point moves...");
		p1.setX(11);
		p2.setX(11);
		System.out.println();
		System.out.println("Line moves...");
		line.moveBy(20, 20);
	}

}
