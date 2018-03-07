/**
 * Author:	Sam Cooney
 * Project:	MasterHelper
 * Date:	Sep 27, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

public class MyMaster {

	public static void main(String[] args) {
		MyHelper helpme = new MyHelper();	// Instantiate new object.
		int apples = 5;
		int bananas = 6;
		
		int answer = helpme.addIt(apples, bananas);		// Calls addIt method.
		System.out.println("addIt returned the following: " + answer);
		double multiAns = helpme.multiMeth(4.0, 2.0);	// Calls multiMeth method.
	}
}	// Ends class.
