package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		//ExecutorService 생성
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newFixedThreadPool(coreCount * 2);
		
		//1000초 시간 
		for(int i=0; i<1000; i++) {
			final int idx = i;
			String from = mails[idx][0];
			String to = mails[idx][1];
			String content = mails[idx][2];
			//mail 발송 하는 부분 --> network 시간, cpu 시간 사용안됨
			//실행 시간 1초 
			System.out.println("[메일 발송] " + from + " ==> " + to + ": " + content);
		}

		//앞에서 학습한 일반 스레드  
		//1000초 시간 
		for(int i=0; i<1000; i++) {
			final int idx = i;
			new Thread(() -> {
				String from = mails[idx][0];
				String to = mails[idx][1];
				String content = mails[idx][2];
				//mail 발송 하는 부분 --> network 시간, cpu 시간 사용안됨
				//실행 시간 1초 
				System.out.println("[메일 발송] " + from + " ==> " + to + ": " + content);
			}).start();
		}

		
		//이메일을 보내는 작업 생성 및 처리 요청
		for(int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(() -> {
				Thread thread = Thread.currentThread();
				String from = mails[idx][0];
				String to = mails[idx][1];
				String content = mails[idx][2];
				System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + ": " + content);
			});
		}
			
		//ExecutorService 종료
		executorService.shutdown();
	}
}