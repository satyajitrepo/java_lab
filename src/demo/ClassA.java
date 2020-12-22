package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClassA {
	
	public void meth1() throws IOException {
		meth2();
	}

	public void meth2() throws IOException {
		meth3();		
	}

	public void meth3() throws IOException {
		FileInputStream fis;
		Properties prop = new Properties();
		
		String filePath = "F:\\EnterpriseEnvironment\\JavaLab\\Lab1\\src\\readme.properties";

		File f = new File(filePath);

		fis = new FileInputStream(f);
		prop.load(fis);	
		
		System.out.println(prop.getProperty("name"));
	}
}
