package money;

public class RectangleCoin implements CoinShape {

	public final double width;
	public final double length;
	private final double value = 5;

	public RectangleCoin(double widht, double length) {
		this.width = widht;
		this.length = length;
	}

	@Override
	public double area() {
		return width * length;
	}

	@Override
	public double perimeter() {
		return 2 * (width * length);
	}

	@Override
	public double realValue() {
		return value * area() - perimeter();
	}

	@Override
	public String toString() {
		return "RectangleCoin [area()= " + area() + ", perimeter()= " + perimeter() + "]";
	}

}
