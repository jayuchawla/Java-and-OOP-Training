//https://java2blog.com/java-serialization-interview-questions-and-answers/
package com.hsbc.serializtion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * This class is a Model Class for Employee
 * @author JayprakashChawla
 *
 */
public class Employee implements Serializable {
	
	/**
	 * serialVersionUID is used to ensure that same class(That was used during Serialization) is loaded during Deserialization.serialVersionUID is used for version control of object.You can read more at serialVersionUID in java serialization
	 */

	private static final long serialVersionUID = 6888006337771011742L;
	String empName;
	int empId;
	Address a;
	//transient is used to disallow(mark as 0) empSalary to be available for serialization
	transient int empSalary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int empSalary, int pincode, String place) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.a = new Address(pincode, place);
	}

	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", a=" + a + ", empSalary=" + empSalary + "]";
	}

	// doSerialize requires to write object state to a file
	// hence FileOutputStream is used
	public void doSerialize() {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {

			fos = new FileOutputStream("object_state.data");
			oos = new ObjectOutputStream(fos);
			// WHENEVER THIS method:: writeObject is met JAVA CHECKS IF YOUR CLASS
			// IMPLEMENTS SERIALIZABLE, if not gives you an error
			oos.writeObject(this);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// GETTING OBJECT state from FILE
	// We require FileInputStream
	public Employee doDeserialize() {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {

			fis = new FileInputStream("object_state.data");
			ois = new ObjectInputStream(fis);
			return (Employee) ois.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}
}
