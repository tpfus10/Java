package Practice;

import java.util.function.Function;

abstract class Geometry2 {
	abstract double getArea();
}

class Circle2 extends Geometry2 {
	int radius;
	
	public Circle2(int radius) {
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		return (double)(Math.PI*radius*radius);
	}
	
}

class Rectangle2 extends Geometry2 {
	int width;
	int height;
	
	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double getArea() {
		return (double)(width*height);
	}
}

class Triangle2 extends Geometry2 {
	int width;
	int height;
	
	public Triangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double getArea() {
		return (double)(width*height*0.5);
	}
	
}

public class AreaCalc1 {
	public static void main(String[] args) {
		Function<Geometry2, Double> func2 = (g) -> {
			return g.getArea();
		};
		
		System.out.println("원의 면적 : " + func2.apply(new Circle2(5)));
		System.out.println("사각형의 면적 : " + func2.apply(new Rectangle2(10, 20)));
		System.out.println("삼각형의 면적 : " + func2.apply(new Triangle2(10, 20)));
	}

}



