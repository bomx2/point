package point;

public class PointApp {
	
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(2);
		point.setY(5);
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);
		
		Point point3 = new Point(50,50);

		point.show();
		point2.show();
		point3.show();
		
		point.show(true);
		point2.show(false);
		point3.show(false);
		
		ColorPoint colorpoint = new ColorPoint();
		colorpoint.setX(10);
		colorpoint.setY(50);
		colorpoint.setColor("red");
		colorpoint.show();
	}

}
