package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Brandon", "Lucy", "Kyle", "Stacy", "Micah"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Griffin";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(String name : names) {
			System.out.println(name);
		}
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for(int times = 0; times < 50; times++) {
			numbers[times] = ran.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNum = 100;
		for(int times = 0; times < 50; times ++) {
			if(numbers[times] < smallestNum) {
				smallestNum = numbers[times];
			}
		}
		System.out.println("The smallest number in the array is " + smallestNum);
		//9 print the entire array to see if step 8 was correct
		System.out.println("");
		System.out.println("Array:");
		System.out.println(Arrays.toString(numbers));
		//10. print the largest number in the array.
		int largestNum = 0;
		for(int times = 0; times < 50; times++) {
			if(numbers[times] > largestNum) {
				largestNum = numbers[times];
			}
		}
		System.out.println("");
		System.out.println("The largest number in the array is " + largestNum);
	}
}
