package ch12.sec03.exam01;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

//		if(obj1.hashCode() == obj2.hashCode()) {
//			System.out.println("obj1과 obj2는 동등합니다.");
//		} else {
//			System.out.println("obj1과 obj2는 동등하지 않습니다.");
//		}
		Object obj4 = new Object();
		int [] obj5 = {10,20,30};
		
		if(obj1.equals(null)) {
			System.out.println("obj1과 null는 동등합니다.");
		} else {
			System.out.println("obj1과 null는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj5)) {
			System.out.println("obj1과 obj5는 동등합니다.");
		} else {
			System.out.println("obj1과 obj5는 동등하지 않습니다.");
		}

		if(obj1.equals(obj4)) {
			System.out.println("obj1과 obj4는 동등합니다.");
		} else {
			System.out.println("obj1과 obj4는 동등하지 않습니다.");
		}
		
		if(obj1.equals("hello")) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
//
//		if(obj1.equals(obj3)) {
//			System.out.println("obj1과 obj3은 동등합니다.");
//		} else {
//			System.out.println("obj1과 obj3은 동등하지 않습니다.");
//		}
	}
}