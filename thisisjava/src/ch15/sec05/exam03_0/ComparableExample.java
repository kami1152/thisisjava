package ch15.sec05.exam03_0;

import java.util.Arrays;

//Person에 대한 소스 수정 권한 있을 때 
public class ComparableExample {
	public static void main(String[] args) {
		Person [] array =  {
			new Person("홍길동", 45)
			,new Person("감자바", 25)
			,new Person("박지원", 31)
		};
		
		Arrays.sort(array);
		
		//객체를 하나씩 가져오기
		for(Person person : array) {
			System.out.println(person.name + ":" + person.age);
		}
		
	}
}