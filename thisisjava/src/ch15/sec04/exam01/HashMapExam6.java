package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//DTO -> Map으로 대신하여 구현하는 방법 
public class HashMapExam6 {

	//id를 키로해서 Map 객체를 관리한다 
	Map<String, Map<String, String>> array = new Hashtable<String, Map<String,String>>();

	public void addStudent(String id, String name, String phone) {
		Map<String, String>  map = new HashMap<>();

		map.put("id", id);
		map.put("name", name);
		map.put("phone", phone);
		
		//배열에 map 객체를 추가한다
		//array.add(map);
		array.put(id, map);
	}

	public void output() {
		for (var map : array.entrySet()) {
			System.out.println(map.getValue());
		}
	}
	
	//한사람의 객체를 map으로 생성하여 List에 추가하여 관리함
	public static void main(String[] args) {
		
		HashMapExam6 exam = new HashMapExam6();
		
		for (int i=0;i<10000;i++) {
			exam.addStudent(String.valueOf(i), "홍길동" + String.valueOf(i), "010-1234-1234");
		}

//		exam.output();
		for (int i=0;i<100;i++) {
			long tick = System.nanoTime();
			var student = exam.array.get("9000");
//			if (student != null) {
//				System.out.println(student);
//			}
			tick = System.nanoTime() - tick;
			System.out.println("실행시간 : " + tick);
		}
	}

}
