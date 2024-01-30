package com.src.designpattern.singletondesignpattern;

import java.io.Serializable;

public class Samosa implements Serializable,Cloneable{
	
	private static Samosa samosa;

	private Samosa() {
		
	}
	
	public static Samosa getSamosa() {
		if(samosa==null) {
			
			synchronized (Samosa.class) {
				if(samosa==null) {
					
					samosa = new Samosa();
				}
			}
		}
		
		return samosa;
	}
	
	
	
	/*
	 * public Object readResolveObject() { return samosa; }
	 */
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
	
	/*
	 * private static Samosa samosa;
	 * 
	 * private Samosa() {
	 * 
	 * }
	 * 
	 * public static Samosa getSamosa() {
	 * 
	 * if (samosa == null) { synchronized (Samosa.class) { if (samosa == null) {
	 * samosa = new Samosa(); } }
	 * 
	 * }
	 * 
	 * return samosa; }
	 */

}
