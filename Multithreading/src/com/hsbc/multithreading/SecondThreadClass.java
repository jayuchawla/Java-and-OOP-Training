package com.hsbc.multithreading;

public class SecondThreadClass extends Thread{
	
	@Override
	public void run() {
		Thread d = Thread.currentThread();
		
		/*for(int i = 0;i<27;i++) {
			System.out.println(d.getName() + " " + (char)(97+i));
			try {
				//Thread.sleep() is a static method of Thread class
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		MathematicalTableClass.printTable(10);
	}
}
