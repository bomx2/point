package point;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint() {
	}
	
	public ColorPoint(int x, int y, String color) {
		setX(x);
		setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show(){
		System.out.println("좌표 : ("+super.getX()+", "+super.getY()+") 에 "+color+"색깔의 점을 그렸습니다.");
	}

}
