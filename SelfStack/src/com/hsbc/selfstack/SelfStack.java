package com.hsbc.selfstack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * This class is an ArrayList representation of generic (yet homogeneous) stack
 * @author JAYPRAKASH CHAWLA
 *
 */

public class SelfStack<T> {
	
	/*ArrayList representation os stack*/
	ArrayList stack;
	
	/**
	 * CONSTRUCTOR
	 */
	public SelfStack(){
		stack = new ArrayList();
	}
	
	/**
	 * Element to be pushed
	 * @param element
	 */
	public void push(T element) {
		stack.add(element);
	}

	/**
	 * Pops top of stack
	 */
	public T pop() {
		return (T) stack.remove(stack.size()-1);
	}
	
	public void printStack() {
		Iterator it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
