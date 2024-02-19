package ch14.sec06.exam03;

public class WaitNotifyExample {
	public static void main(String[] args)throws Exception {
		WorkObject workObject = new WorkObject();

		NetworkThread networkThread = new NetworkThread(workObject);
		CalcThread calcThread = new CalcThread(workObject);
		PrintThread printThread = new PrintThread(workObject);
		FileSaveThread fileSaveThread = new FileSaveThread(workObject);

		networkThread.start();
		networkThread.join();
		
		calcThread.start();
		printThread.start();
		fileSaveThread.start();
		
		fileSaveThread.join();
		printThread.join();
		
	}
}