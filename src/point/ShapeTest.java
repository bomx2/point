package point;

public class ShapeTest {
	public static void main(String[] args) {
		//오버라이딩 테스트
		Shape rect = new Rect();
		Shape circle = new Circle();

		rect.draw();
		circle.draw();
	}

}
