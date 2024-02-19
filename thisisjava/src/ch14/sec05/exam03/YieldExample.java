package ch14.sec05.exam03;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		workThreadA.work = false;

		try { Thread.sleep(500); } catch (InterruptedException e) {}
		workThreadA.work = true;
		
		try { Thread.sleep(100); } catch (InterruptedException e) {}
		workThreadA.run = false;
		workThreadB.run = false;
		
		System.out.println("프로그램 종료 ");
	}
}