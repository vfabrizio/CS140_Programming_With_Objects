package assignment08;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		if (width < 0 || height < 0) {
			throw new IllegalArgumentException("Can't have negative width or heights");
		}
		if (width == 0 || height == 0) {
			return 0;
		}
		if (width == 1) {
			return height;
		}
		Rectangle rect = new Rectangle(width-1, height);
		return rect.getArea() + height;
		
	}
}
