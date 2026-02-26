// 1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
// [Hint: Use array and loop and try to access the element beyond the last index.]


public class ArrayException {

	public static void main(String[] args) {
		  try {
	          int [] elements= {12,14,16};
	          for(int i=0;i<=elements.length;i++) {
	        	  System.out.println("Elements of array:"+elements[i]);
	          }
			  }
			  catch(ArrayIndexOutOfBoundsException e) {
				  System.out.println("Error: Array index is out of bounds!");
			  }

	}

}

/*Output:
 
Elements of array:12
Elements of array:14
Elements of array:16
Error: Array index is out of bounds!
 
*/