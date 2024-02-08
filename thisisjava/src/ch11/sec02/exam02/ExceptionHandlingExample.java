package ch11.sec02.exam02;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) throws ClassNotFoundException {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");

			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
	}
}