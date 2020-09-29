public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NOTE IF we explicitly create an object of MathematicalTableClass in FirstThreadClass & SecondThreadClass and my printTable method is not static
		//we are not having a shared resource (each of FIrstThreadClass & SecondThreadClass object has it's own object of MathematicalTableClass) hence synchronized keyword is of no use
		//but if we share a common MathematicalTableClass object with objects of FirstThreadClass and SecondThreadClass then synchronized keyword is actually used.

		MathematicalTableClass m = new MathematicalTableClass();
		
		FirstThreadClass t1 = new FirstThreadClass(m);
		SecondThreadClass t2 = new SecondThreadClass(m);
		t1.start();
		t2.start();
	}
}
