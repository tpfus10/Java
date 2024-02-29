package Practice;

import java.util.function.Function;

class Geometry {
	double explain(double d) {
		return d;
	}
}

class Circle extends Geometry {
	int radius;
}

class Rectangle extends Geometry {
	int width;
	int height;
}

class Triangle extends Geometry {
	int width;
	int height;
}


public class AreaCalc {
public static void main(String[] args) {
	
	Function<Geometry, Double> func1 = (g1) -> {
		if (g1 instanceof Circle) {  
			Circle circle = (Circle) g1;
			return (double) (Math.PI*(circle.radius^2)); //Math.PI는 파이
		};
		
	Function<Geometry, Double> func2 = (g2) -> {
		 if (g2 instanceof Rectangle) {  
		        Rectangle rectangle = (Rectangle) g2;
		        return (double) (rectangle.width*rectangle.height);
		};
		
	Function<Geometry, Double> func3 = (g3) -> {
		if (g3 instanceof Triangle) {  
			Triangle triangle = (Triangle) g3;
	        return (double) (triangle.width*triangle.height*0.5);
		};
		
		System.out.println("원의 면적 : " + func1.apply(5);
		System.out.println("사각형의 면적 : " + func2.apply(10, 20));
		System.out.println("삼각형의 면적 : " + func3.apply(10, 20));
	}
}
	



