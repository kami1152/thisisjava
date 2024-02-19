package ch14.sec01.exam01;

//class WorkThread1 implements Runnable {
//	@Override
//	public void run() {
//		for (int i=0;i<10000;i++) {
//			System.out.println("네트웩작업");
//		}
//	}
//}

//class WorkThread2 implements Runnable {
//	@Override
//	public void run() {
//		for (int i=0;i<10000;i++) {
//			System.out.println("드로잉작업");
//		}
//	}
//}

public class Exam2 {

	public static void main(String[] args) {

		//스레드로 생성만 한 것임, 실행안됨  
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0;i<10000;i++) {
					System.out.println("네트웩작업");
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0;i<10000;i++) {
					System.out.println("드로잉작업");
				}
			}
		});
		
		//스레드 실행 
		t1.start();
		t2.start();
		
		for (int i=0;i<10000;i++) {
			System.out.println("메인 스레드 실행");
		}
		
		
	}

}
