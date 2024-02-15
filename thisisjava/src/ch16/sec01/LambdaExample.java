package ch16.sec01;

class AddCalculable implements Calculable {
	@Override
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SubCalculable implements Calculable {
	@Override
	public int calculate(int x, int y) {
		return x - y;
	}
}

public class LambdaExample {
	
	public static void main(String[] args) {

//		class AddCalculable implements Calculable {
//			@Override
//			public int calculate(int x, int y) {
//				return x + y;
//			}
//		}
		
		int result = action(new AddCalculable());
		
//		result = action(new Calculable() {
//			public int calculate(int x, int y) {
//				return x + y;
//			}
//		});
		result = action((x, y) -> {return x + y;});
		
		System.out.println("10 + 4 = " + result);
		
		result = action(new SubCalculable());
		result = action((x, y) -> {return x - y;});
		System.out.println("10 - 4 = " + result);
		
//		action((x, y) -> {
//			int result = x + y;
//			System.out.println("result: " + result);
//		});
//
//		action((x, y) -> {
//			int result = x - y;
//			System.out.println("result: " + result);
//		});
	}

	public static int action(Calculable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		return calculable.calculate(x, y);
	}
}