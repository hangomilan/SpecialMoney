package money;

public class TriangleCoin implements CoinShape {

	private final double a;
	private final double b;
	private final double c;

	private final double value = 1;

	public TriangleCoin(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		if (!isValid()) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Invalid parameters!");
			}
		}
	}
	
	private boolean isValid() {
        return ((a + b > c) && (a + c > b) && (b + a > c));
    }

	@Override
	public double area(){
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double perimeter() {
		return a + b + c;
	}

	@Override
	public double realValue() {
		return value * perimeter() - area();
	}

	@Override
	public String toString() {
		return "TriangleCoin [area()= " + area() + ", perimeter()= " + perimeter() + "]";
	}

}
