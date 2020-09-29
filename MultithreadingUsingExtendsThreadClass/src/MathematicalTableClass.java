

public class MathematicalTableClass {
	
	//synchronized helps resolving printTable since this is a shared resource
	public synchronized void printTable(int a) {
		for(int i = 0;i<10;i++) {
			System.out.println(a+"*"+(i+1)+"="+a*(i+1));
		}
	}

}
