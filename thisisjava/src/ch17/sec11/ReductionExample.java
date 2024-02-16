package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 2),
				new Student("신용권", 2),
				new Student("감자바", 3)
		);		
		//방법1
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();		
		
		//방법2
		int sum2 = studentList.stream()
						.map(Student :: getScore)
						.reduce(1, (a, b) -> a * b);
		
		//int [] arr = {10, 20, 30, 40, 50};
		//int sum = 0; //초기식
		//sum =  0, v : 10    ret <== sum + v
		//sum =  ret, v : 20 , 
		//sum =  0, v : 30
		//sum =  0, v : 40
		//sum =  0, v : 50
//		for (int v : arr) {
//			sum = sum + v; 
//		}
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}





