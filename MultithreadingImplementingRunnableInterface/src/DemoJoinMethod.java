
public class DemoJoinMethod {
	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0;i<10;i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start();
		try {
			//SUPPOSE THERE IS INTER THREAD DEPENDENCY OF T2 and T3 on T1 and hence T1 needs to get executed first
			//explicit force T1 to get executed first
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
