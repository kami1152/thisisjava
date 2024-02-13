package ch13.sec04;

public class GenericExample {
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T> boolean compare_1(T t1, T t2) {
		if (t1 instanceof Number v1) {
			if (t2 instanceof Number v2) {

				double d1 = v1.doubleValue();
				double d2 = v2.doubleValue();
				
				return d1 == d2;
			}
		}
		return false;
	}
	
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		//T의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " +
				t2.getClass().getSimpleName() + ")");

		//Number의 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();

		return (v1 == v2);
	}
	
	public static void main(String[] args) {
//		boolean result1 = compare_1(10.10, 20.10);
//		System.out.println(result1);
//		System.out.println();
//		
//		boolean result2 = compare_1(10.10, "20.10");
//		System.out.println(result2);
//		System.out.println();
		
		//제네릭 메소드 호출
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println();

		//제네릭 메소드 호출
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
		//제네릭 메소드 호출 
//		boolean result3 = compare(4.5, "4.5");
//		System.out.println(result3);
	}

	

}