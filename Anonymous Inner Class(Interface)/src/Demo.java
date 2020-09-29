
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ANON CLASS IS LOADED ONCE CALLED, ONCE ;(end of anon class) found it is cleared from mem too 
		//SAME FUNC CAN DO DIFF OPERATIONS IN SAME OUTER CLASS(Demo)
		MyInterface miadd = new MyInterface() {

			@Override
			public double doAction(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		MyInterface misub = new MyInterface() {
			
			@Override
			public double doAction(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		
		///SHORTHAND VERSION OF ANONYMOUS 
		MyInterface mimul = (int a, int b) -> a*b;
		
		System.out.println(miadd.doAction(34, 25));
		System.out.println(misub.doAction(34, 25));
		System.out.println(mimul.doAction(34, 25));
	}

}
