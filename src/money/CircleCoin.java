package money;

public class CircleCoin implements CoinShape {

	private final double radius;
	private final double value = 2;

	final double pi = Math.PI;

	public CircleCoin(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return pi * Math.pow(radius, 2);
	}

	@Override
	public double perimeter() {
		return 2 * pi * radius;
	}

	@Override
	public double realValue() {
		return value * area() - perimeter();
	}

	@Override
	public String toString() {
		return "CircleCoin [area()= " + area() + ", perimeter()= " + perimeter() + "]";
	}

}
