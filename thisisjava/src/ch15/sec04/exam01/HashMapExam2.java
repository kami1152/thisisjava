package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;

//DTO -> Map으로 대신하여 구현하는 방법 
public class HashMapExam2 {

	//한사람의 객체를 map으로 관리하는 방법 
	public static void main(String[] args) {
		Map<String, String>  map = new HashMap<>();

		map.put("id", "1");
		map.put("name", "강연규");
		map.put("phone", "010-1234-1234");

		System.out.println(map);
	}

}
