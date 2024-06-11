package thread_example;

public class THREAD_DEMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread1 th1 = new thread1();
		
		th1.start();
		
		thread2 th2 = new thread2();
		Thread th = new Thread(th2);
		
		th.start();
			

	}

}
