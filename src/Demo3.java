import java.util.ArrayList;

/**
 * NullPointerException demo
 * @author Laptop 3
 *
 */

class Employee{
	int salary = 10000;
}

public class Demo3 {
	
	public static void main(String[] args) {

//		Employee emp = null;
//		System.out.println(emp.salary);
		
//		ArrayList<String> myList;
//		myList.add("Saswata");
		
		int[] arr = new int[5];
		
		arr = null;
		
		System.out.println(arr[4]);

	}

}
