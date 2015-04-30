package point;

public class PointApp {
	
	public static void main(String[] args) {
//		Point point = new Point();
//		point.setX(2);
//		point.setY(5);
//		
//		Point point2 = new Point();
//		point2.setX(10);
//		point2.setY(23);
//		
//		Point point3 = new Point(50,50);
//
//		point.show();
//		point2.show();
//		point3.show();
//		
		//boolean으로 메서드 만든 것 이용
//		point.show(true);
//		point2.show(false);
//		point3.show(false);
//		
//		ColorPoint colorpoint = new ColorPoint();
//		colorpoint.setX(10);
//		colorpoint.setY(50);
//		colorpoint.setColor("red");
//		colorpoint.show();
		
		//인터페이스 테스트
		Drawable drawable = new Point(10,20);
		drawable.draw();
		
		//instanceof 테스트
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		System.out.println(c instanceof Visible);
		
		//Error
		//System.out.println(c instanceof Rect);
		Shape s= c;
		System.out.println(s instanceof Rect);
		
	}

}
