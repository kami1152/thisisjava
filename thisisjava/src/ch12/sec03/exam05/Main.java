package ch12.sec03.exam05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member m = new Member("1234", "홍길동");
		Member m = Member.builder()
					.id("1234")
					.name("홍길동")
					.build();
		
	}

}
