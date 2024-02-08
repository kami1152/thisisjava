package ch12.sec11.exam02;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("사람 객체 생성");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
