import java.util.StringTokenizer;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//STRINGBUFFER AND STRINGBUIDER PROVIDE MUTABILITY FEATURE TO STRINGS,
		//since these do not create new string objects hence we need to use new keyword
		StringBuffer sb1 = new StringBuffer("Hello World");
		System.out.println(sb1);
	
		//1
		//NOTE::StringTokenizer requires you an object of String and not String
		//Hence you can expect all new tokens are stored in String Literal Pool
		StringTokenizer st = new StringTokenizer(sb1.toString());
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
