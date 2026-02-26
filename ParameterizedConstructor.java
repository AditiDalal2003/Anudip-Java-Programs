// Write program for Parameterized Constructor.


public class ParameterizedConstructor {
	
	String name;
	int eid;
	String dept_name;
	int salary;

	ParameterizedConstructor(String n, int e, String d, int s){
		name=n;
		eid=e;
		dept_name=d;
		salary=s;
		
		System.out.println("This is ParameterizedConstructor");
		
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor obj1=new ParameterizedConstructor("Vivek",007,"Software Developer",60000);
			System.out.println("Name:" + obj1.name + " Eid:" + obj1.eid + " Dept_name:"+ obj1.dept_name + " Salary:" + obj1.salary );
		
	}

}

/*Output:
This is ParameterizedConstructor
Name:Vivek Eid:7 Dept_name:Software Developer Salary:60000
 */
