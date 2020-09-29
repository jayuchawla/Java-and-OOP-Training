package com.hsbc.serializtion;

/**
 * This class is the entry point.
 * @author jayprakashChawla
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Jayu", 88, 440014, "Nagpur");
		e1.doSerialize();

		Employee e2 = new Employee();
		e2 = e1.doDeserialize();
		System.out.println(e2);
	}

}
