package com.src.designpattern.singletondesignpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {
	
	public static void main(String[] args) throws Exception,CloneNotSupportedException{
		
		/*
		 * Samosa samosa = Samosa.getSamosa();
		 * 
		 * System.out.println(samosa.hashCode());
		 * 
		 * Samosa samosa2 = Samosa.getSamosa();
		 * 
		 * System.out.println(samosa2.hashCode());
		 * 
		 * System.out.println(Jalebi.getJalebi().hashCode());
		 * System.out.println(Jalebi.getJalebi().hashCode());
		 */
		
		/*
		 * Samosa samosa = Samosa.getSamosa(); System.out.println(samosa.hashCode());
		 */
		/*
		 * Constructor<Samosa> declaredConstructor =
		 * Samosa.class.getDeclaredConstructor();
		 * declaredConstructor.setAccessible(flag:true);
		 * Samosa s2 = declaredConstructor.newInstance();
		 * System.out.println(s2.hashCode());
		 */
		Samosa samosa= Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		
		/*
		 * ObjectOutputStream out = new ObjectOutputStream(new
		 * FileOutputStream("abc.ob")); out.writeObject(samosa);
		 * 
		 * System.out.println("Serialization done");
		 * 
		 * 
		 * ObjectInputStream oin = new ObjectInputStream(new FileInputStream("abc.ob"));
		 * 
		 * Object s2 = oin.readObject(); System.out.println(s2.hashCode());
		 */
	
	Samosa s2= (Samosa)samosa.clone();
	System.out.println(s2.hashCode());
		
	}

}
