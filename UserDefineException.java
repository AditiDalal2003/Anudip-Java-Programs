// 2.Create program for Custom Exception.


class CheckedAgeException extends Exception{
	 
	  public CheckedAgeException (String message) {
		  super(message);
	  }
}

public class UserDefineException {

	public static void main(String[] args) {
		    
		int age=18;
		if(age<21) {
			try {
				throw new CheckedAgeException("Sorry, you cannot apply for this job because your age is less than 21");
			}
			catch(CheckedAgeException c){
				System.out.println(c.getMessage());
			}
		}
		else {
			System.out.println("Congratulations! You can apply for this job.");
		}

	}

}

/* Output:
 
 Sorry, you cannot apply for this job because your age is less than 21
*/