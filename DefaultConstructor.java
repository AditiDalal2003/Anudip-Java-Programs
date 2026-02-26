// 1. Write program for Default Constructor.

public class DefaultConstructor {

	String name;
	int rollno;
	String course;
	String email;
	
	DefaultConstructor(){
		name="Aditi";
		rollno=28;
		course="Java";
		email="aditi@gmail.com";
		
		System.out.println("This is Default Constructor");
		}
	
	
	
	public static void main (String[] args) {
		
		DefaultConstructor obj=new DefaultConstructor();
		System.out.println("Name:" + obj.name + " Rollno:" + obj.rollno + " Course:" + obj.course + " Email:" + obj.email);
                

	}
}

/*Output:
 This is Default Constructor
 Name:Aditi Rollno:28 Course:Java Email:aditi@gmail.com
 */
