package demo;

import java.io.IOException;

public class ThrowExample1 {

	public void validate(int age) throws NotValidException, IOException, ArithmeticException {
		if(age < 18) {
			throw new NotValidException("Your age is below 18. Sorry! you are not eligible for vote...");
		}
		else {
			System.out.println("You are eligible for vote.");
		}
	}
	
	public static void main(String[] args) {
		
		ThrowExample1 te1 = new ThrowExample1();
		try {
			te1.validate(17);
		}
		catch(Exception e) {
			
		}

	}

}
