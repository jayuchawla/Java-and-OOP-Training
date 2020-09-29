
//NOTE:: I prefer implementing Runnable rather than extending Thread class
//In my class with main I'll create a Thread class object and pass it object of this class as argument
//since this class object holds definition for run()
public class HelloThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<11; i++) {
			System.out.println("HelloThread class: "+i);
		}
	}

	
}
