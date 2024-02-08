package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-[0-9]{3,4}-\\d{4}";
		String data = "0110-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		//aaa@aaa (X)
		//aaa@aaa. (X)
		//aaa@aaa.com (o)
		//aaa@aaa.co.kr (o)
		//aaa@aaa.co.kr.jp (o)
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@mycompanycom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()-_=+]).{8,20}$";
		String pwd = "1234abc";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("비밀번호 사용가능합니다");
		} else {
			System.out.println("비밀번호 사용불가능합니다");
		}
		
	}
}