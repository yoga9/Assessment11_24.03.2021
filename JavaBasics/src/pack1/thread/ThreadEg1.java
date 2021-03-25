package pack1.thread;

public class ThreadEg1 extends Thread {
     
	public static void main(String[] args) {
		
		ThreadEg1 s = new ThreadEg1();
		ThreadEg1 s1 = new ThreadEg1();
		ThreadEg1 s2 = new ThreadEg1();
		
		s2.start();
		s2.setName("Thread First");
		s2.setPriority(NORM_PRIORITY);
		
		try {
		s2.join(1000);                           //Using join
		System.out.println("Hello World !!!");
		}
		
		catch(Exception e) {
			System.out.println();
		}
		
		s.start(); //Using start alone
		s.setName("Thread Second");
		s.setPriority(MIN_PRIORITY);
		//s.run();                      //Using run alone
		System.out.println("Hello");
		
		
		s1.start();
		s1.setName("Thread Third");
	    s1.setPriority(MAX_PRIORITY);
		//s1.start();              //Exception
		//s1.run();
		System.out.println("Yogi");
		
}
	
	public void run() {
		
		System.out.println("Running Thread name is : "+Thread.currentThread().getName());
		System.out.println("Running Thread name is : "+Thread.currentThread().getPriority());
		
		for(int i=1;i<=5;i++) {
			
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			
	}
 }
}

//Output:
//	Running Thread name is : Thread First
//	Running Thread name is : 5
//	1
//	2
//	3
//	4
//	5
//	Hello World !!!
//	Hello
//	Yogi
//	Running Thread name is : Thread Third
//	Running Thread name is : 10
//	Running Thread name is : Thread Second
//	Running Thread name is : 1
//	1
//	1
//	2
//	2
//	3
//	3
//	4
//	4
//	5
//	5
