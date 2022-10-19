package com.yash.pracQues;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable thread1 = () -> {
			try {
				for(int i=1;i<=10;i++) {
					System.out.println("The value of i is "+ i);
					Thread.sleep(1000);
				}				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t1=new Thread(thread1);
		t1.setName("Thread1");
		t1.start();
	}
}
