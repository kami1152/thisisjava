package ch15.sec05.exam03_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		Person[] array = { 
				new Person("홍길동", 45), 
				new Person("감자바", 25), 
				new Person("박지원", 31) };

//		//local 클래스 
//		class PersonCompare implements Comparator<Person> {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.age - o2.age;
//			}
//		}
//		
//		Arrays.sort(array, new PersonCompare());
		
		//익명의 클래스  
		Arrays.sort(array, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.age - o2.age;
			}
		});
		
		//람다 구문을 사용하는 방법 
		//Arrays.sort(array, (o1, o2) -> {return o1.age - o2.age;});
		Arrays.sort(array, (o1, o2) -> o1.age - o2.age);

		// 객체를 하나씩 가져오기
		for (Person person : array) {
			System.out.println(person.name + ":" + person.age);
		}
	}
}