package exceptions;

public class Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj = new Thread();
//		Thread thread = new Thread(obj);
//		thread.start();
		System.out.println("This is outside code");
	}
	public void run() {
		System.out.println("This code is running in the thread");
	}

}
