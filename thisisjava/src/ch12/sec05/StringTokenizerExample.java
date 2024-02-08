package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동/이수홍/박연수/이순신/홍길동/이수홍/박연수/이순신";
		String[] arr = data1.split("/");
		System.out.println(arr[2]);
//		for(String token : arr) {
//			System.out.println(token);
//		}
		System.out.println();

		String data2 = "홍길동/이수홍/박연수/이순신/홍길동/이수홍/박연수/이순신";
		StringTokenizer st = new StringTokenizer(data2, "/|");
//		int i=0;
//		while (st.hasMoreTokens()) {
//			String token = st.nextToken();
//			if (i == 2) {
//				System.out.println(token);
//				break;
//			}
//			i++;
//		}
		
		for (int i=0;st.hasMoreTokens();i++) {
			String token = st.nextToken();
			if (i == 2) {
				System.out.println(token);
				break;
			}
		}

		for (int i=0;st.hasMoreTokens();i++) {
			String token = st.nextToken();
			if (i != 2) continue;
			
			System.out.println(token);
			break;
		}
	}
}