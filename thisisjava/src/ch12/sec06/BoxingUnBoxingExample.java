package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		Object o = 100;
		System.out.println("value: " + obj.intValue());
		System.out.println("value: " + obj);
		System.out.println("value: " + o);

		//Unboxing
		int value = obj;
		value = (Integer)o;
		System.out.println("value: " + value);
		
		//연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}