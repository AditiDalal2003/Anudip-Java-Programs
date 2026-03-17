// 2. Write a Java program  to implement Stack.


import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	      
		Stack <Integer> s1 = new Stack();
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(90);
		
		System.out.println("Elements of Stack:"+s1 );
		
		s1.pop();
		System.out.println("Stack afer pop"+s1);
		
		
		System.out.println("Top element:"+s1.peek());
		System.out.println("Is Stack Empty:"+s1.isEmpty());
		System.out.println("Size of Stack:"+s1.size());
		System.out.println("Capacity of Stack:"+s1.capacity());
		System.out.println("Position of 20:"+s1.search(20));
		System.out.println("Clone of Stack:"+s1.clone());
		System.out.println("Contains 10?"+s1.contains(60));
		s1.clear();
		System.out.println("After clear stack:"+s1);
		
	}
	
}

/*Output:
 
Elements of Stack:[20, 30, 40, 50, 60, 90]
Stack afer pop[20, 30, 40, 50, 60]
Top element:60
Is Stack Empty:false
Size of Stack:5
Capacity of Stack:10
Position of 20:5
Clone of Stack:[20, 30, 40, 50, 60]
Contains 10?true
After clear stack:[]

*/
