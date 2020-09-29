
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread class needs def for run()
		//we will provide that by HelloThread class' object
		HelloThread ht = new HelloThread();
		
		Thread t1 = new Thread(ht);
		Thread t2 = new Thread(ht);
		
		//We can also provide run method to Thread class object using anonymous class if we do not wish to write HelloThread class 
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0;i<11;i++) {
					System.out.println("Anon :"+i);
				}
			}
		};
		
		Thread t3 = new Thread(r);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
