

public class FirstThreadClass extends Thread{
	
	private MathematicalTableClass m;
	public FirstThreadClass(MathematicalTableClass m) {
		// TODO Auto-generated constructor stub
		this.m = m;
	}
	
	@Override
	public void run() {
		Thread d = Thread.currentThread();
		
		/*for(int i = 0;i<27;i++) {
			System.out.println(d.getName() + " " + i);
			try {
				//Thread.sleep() is a static method of Thread class
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		//MathematicalTableClass m = new MathematicalTableClass();
		this.m.printTable(9);
	}
	
}
