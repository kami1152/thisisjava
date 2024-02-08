package ch12.sec03.exam01;

import java.util.Objects;

public class Member {
	public String id = null;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	//64bit os 에서 객체의 주소는 64bit   -> int(x) / long(O) 
	@Override
	//Object -> String  
	public boolean equals(Object obj) {
		/*
		 * 1. 전달된 인자가 null이면 false 
		 * 2. 나의 hashCode와 전달된 인자의 hashCode가 다르면 false
		 * 3. 나의 객체 주소와 전달된 인자의 객체 주소가 다르면 false
		 * 4. 나의 클래스 정보와  전달된 인자의 클래스 정보가 다르면 false
		 * 5. 나의 객체 멤버 변수와 전달된 인자의 객체의 멤버 변수를 직접 비교하여 
		 *    같으면 true, 아니면 false
		 * */
		if (obj == null)
			return false;
		if (hashCode() != obj.hashCode()) 
			return false;
		if (this == obj)
			return true;
//		if (obj instanceof Member other) {
//			return id.equals(other.id);
//		}
//		return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}

	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member target) {
//			if(id.equals(target.id)) {
//				return true;
//			}
//		}
//		return false;
//	}
}