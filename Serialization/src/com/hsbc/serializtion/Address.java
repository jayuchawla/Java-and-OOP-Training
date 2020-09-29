package com.hsbc.serializtion;

import java.io.Serializable;

/**
 * This class is a Model Class for Address
 * @author JayprakashChawla
 *
 */
public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6913762675156946430L;
	private int pincode;
	private String place;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode, String place) {
		super();
		this.pincode = pincode;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", place=" + place + "]";
	}

}
