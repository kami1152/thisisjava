package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
//		double result1 = 10 * 10 * Calculator.pi;
//		int result2 = Calculator.plus(10, 5);
//		int result3 = Calculator.minus(10, 5);
		{
			Calculator calc = new Calculator();
			double result1 = 10 * 10 * calc.pi;
			int result2 = calc.plus(10, 5);
			int result3 = calc.minus(10, 5);
	
			System.out.println("result1 : " + result1);
			System.out.println("result2 : " + result2);
			System.out.println("result3 : " + result3);
		}
		
		Calculator2 calc2 = new Calculator2();
		int result2 = calc2.plus(10, 5);

	}
}