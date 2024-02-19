package ch06.sec08.exam04;

public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double ... widths ) {
		double result = 1;
		for (double width : widths) {
			result *= width;
		}
		return result;
//		return widths[0] * widths;
	}
}