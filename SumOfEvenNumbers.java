// 1.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.


import java.util.ArrayList;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(50);
		numbers.add(55);
		numbers.add(30);
		numbers.add(27);
		numbers.add(80);
		numbers.add(64);
		
		int sum=0;
		for(int num : numbers) {
			if(num%2==0) {
				sum=sum+num;
			}
		}	
	
		System.out.println("Sum Of All Even Numbers in an ArrayList of Integers:"+sum);
		
	}

}

/*Output:
 
 Sum Of All Even Numbers in an ArrayList of Integers:224
*/
