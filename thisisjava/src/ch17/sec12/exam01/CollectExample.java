package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
	
public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
//		List<Student> mList = new ArrayList<Student>();
//		for (Student s : totalList) {
//			if (s.getSex().equals("남")) {
//				mList.add(s);
//			}
//		}
		
		List<Student> mList = new ArrayList<Student>();
		totalList.stream()
			.filter(s -> s.getSex().equals("남"))
			.map(s -> mList.add(s))
			.forEach(s -> System.out.println(s));
		
		System.out.println(mList);
		
		//남학생만 묶어 List 생성
		/*
		List<Student> maleList = totalList.stream()
		 		.filter(s->s.getSex().equals("남"))
		 		.collect(Collectors.toList());*/
			
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.toList();
		
		System.out.println(maleList);
		
		
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));

		System.out.println();

		//학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(), //Student 객체에서 키가 될 부분 리턴
						s -> s.getScore() //Student 객체에서 값이 될 부분 리턴
					)
			);
			
		System.out.println(map);
		
		Map<String, Student> map2 = totalList.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(), //Student 객체에서 키가 될 부분 리턴
						s -> s //Student 객체에서 값이 될 부분 리턴
					)
			);
		
		System.out.println(map2);

	}
}