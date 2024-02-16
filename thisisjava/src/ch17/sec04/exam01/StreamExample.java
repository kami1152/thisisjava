package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Product> list = new ArrayList<>();
		
		for(int i=1; i<=5; i++) {
//			Product product = new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random()));
//			list.add(product);
			list.add(new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random())));
		}

		long tick = System.nanoTime();
		for (var product : list) {
			System.out.println(product);
		}
		tick = System.nanoTime() - tick;
		System.out.println("실행시간 : " + tick);
		
		//객체 스트림 얻기
		tick = System.nanoTime();
		Stream<Product> stream = list.stream();
//		stream.forEach(p -> System.out.println(p));
		stream.forEach(System.out::println);
		tick = System.nanoTime() - tick;
		System.out.println("실행시간 : " + tick);
	}
}