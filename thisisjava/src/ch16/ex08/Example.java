package ch16.ex08;

interface Function<T> {
	double apply(T t);
}

class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	
}

public class Example {
	private static Student [] students = {
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93),
	};
	
	static  double avg(Function<Student> fun) {
		double sum = 0;
		for (Student s : students) {
			sum += fun.apply(s);
		}
		return sum / students.length;
	}
	
	public static void main(String[] args) {
		//double englishAvg = avg(s -> s.getEnglishScore());
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어 평균 점수 = " + englishAvg);
		
//		double mathAvg = avg(s -> s.getMathScore());
		double mathAvg = avg(Student::getMathScore);
		System.out.println("수학 평균 점수 = " + mathAvg);
		
	}

}
