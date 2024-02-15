package ch16.ex07;

public class Example {
	private static int [] scores = {10, 50, 3};

	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
//		int max = maxOrMin((x, y) -> Math.max(x,  y));
		int max = maxOrMin(Math::max);
		int min = maxOrMin(Math::min);
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

}
