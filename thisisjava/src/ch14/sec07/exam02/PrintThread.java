package ch14.sec07.exam02;


public class PrintThread extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				//1/1000 초 대기 
				Thread.sleep(1); //--> 외부에서 interrupt() 함수 호출 여부 확인
			}
		} catch(InterruptedException e) {
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}