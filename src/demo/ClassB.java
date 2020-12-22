package demo;

import java.io.IOException;

public class ClassB {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		
		try {
			a.meth1();
		} catch (IOException e) {
			System.out.println("The exception is now handled!");
		}
	}
}
