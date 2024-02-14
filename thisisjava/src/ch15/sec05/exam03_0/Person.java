package ch15.sec05.exam03_0;

public class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		//오름 차순 
		//return age - o.age;
		//내림 차순 
		return o.age - age;

	}
}