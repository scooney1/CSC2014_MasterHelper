/**
 * Author:	Sam Cooney
 * Project:	MasterHelper
 * Date:	Sep 27, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

public class MyHelper {	// Helper class for master.

	public MyHelper() {	// Constructor for helper class.
		
		System.out.println("The constructor method has been called.");
	}
	
	public int addIt(int fparam1, int fparam2) {	// Method for adding two numbers.
		
		int sum = fparam1 + fparam2;
		return sum;
	}
	
	public double multiMeth(double n1, double n2) {	// Method for multiplying two numbers.
		
		double ans = n1*n2;
		int newAns = (int)(ans);
		return ans;
	}
}	// End class.
