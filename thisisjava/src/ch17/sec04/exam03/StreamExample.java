package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	static int sum = 0;
	public static void main(String[] args) {
//		for (int i=1;i<100;i++) {
//		}
//		IntStream stream = IntStream.range(1, 100);
		
//		int total = 0;
//		for (int i=1;i<=100;i++) {
//			total += i;
//		}
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(i -> sum += i);
//		stream.forEach(a -> System.out.println(a));
		System.out.println("총합: " + sum);
	}
}