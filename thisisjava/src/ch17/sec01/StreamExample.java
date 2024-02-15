package ch17.sec01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<String> array = new ArrayList<>();
		
		array.add("홍길동");
		array.add("신용권");
		array.add("감자바");
		
//		for (int i=-100;i<array.size();i++) {
//			System.out.println(array.get(i+10));
//		}

		for (String name : array) {
			System.out.println(name);
		}

		Stream<String> stream = array.parallelStream();
		stream.forEach(name -> {
			System.out.println(name);
		});
		
		//Set 컬렉션 생성
		Set<String> set = new HashSet< >();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
//
//		//Stream을 이용한 요소 반복 처리
//		Stream<String> stream = set.stream();
//		stream.forEach( name -> System.out.println(name) );
	}
}