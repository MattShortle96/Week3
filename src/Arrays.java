

public class Arrays {

	public static void main(String[] args) {
		
		//#1:
		System.out.println("Answers to #1:");
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		//Programmatically subtract the value of the first element in the array 
		//from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code). 
		//Print the result to the console.
		int total = ages[ages.length - 1] - ages[0];
		System.out.println(total);
		
		//Add a new age to your array and repeat the step above to ensure it is dynamic 
		//(works for arrays of different lengths).
		//Tried for other ages, it works
		int newAge = 23;
		int[] newAgeArray = new int[ages.length + 1];
		for(int i=0; i < ages.length; i++) {
			newAgeArray[i] = ages[i];
		}
		newAgeArray[newAgeArray.length - 1] = newAge;
		ages = newAgeArray;
		//23 - 3 = 20
		total = ages[ages.length - 1] - ages[0];
		System.out.println(total);
		
		//Use a loop to iterate through the array and calculate the average age. 
		//Print the result to the console.
		int sum = 0;
		for(int i=0; i < ages.length; i++) {
			sum += ages[i];
		}
		double avg = (double) sum / ages.length;
		System.out.println("Average age: " + avg);
		
		System.out.println("Answers to #2:");
		//#2: Create an array of String called names that contains the following values: 
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//Use a loop to iterate through the array and calculate 
		//the average number of letters per name. 
		//Print the result to the console.
		sum = 0;
		for(int i=0; i < names.length; i++) {
			sum += names[i].length();
		}
		double average = (double) sum / names.length;
		System.out.println("Average letters in name: " + average);
		//Use a loop to iterate through the array again and concatenate 
		//all the names together, separated by spaces, and print the result to the console.
		String newName = "";
		for(int i=0; i < names.length; i++) {
			newName += names[i] + " ";
		}
		System.out.println(newName);
		
		//#5: Create a new array of int called nameLengths. 
		//Write a loop to iterate over the previously created names array 
		//and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for(int i=0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//#6: Write a loop to iterate over the nameLengths array and calculate the 
		//sum of all the elements in the array. 
		//Print the result to the console.
		System.out.println("Answer to #5 & #6:");
		int totalChars = 0;
		for(int i=0; i < nameLengths.length; i++) {
			totalChars += nameLengths[i];
		}
		System.out.println("Total sum of characters is " + totalChars);
		
		//#7: Write a method that takes a String, word, and an int, n, 
		//as arguments and returns the word concatenated to itself n number of times. 
		//(i.e. if I pass in “Hello” and 3, I would expect the method to return 
		//“HelloHelloHello”).
		System.out.println("Answer to #7:");
		System.out.println(concat("Hello", 3));
		
		//#8: Write a method that takes two Strings, firstName and lastName, 
		//and returns a full name 
		//(the full name should be the first and the last name as a String 
		//separated by a space).
		System.out.println("Answer to #8:");
		System.out.println(fullName("Matthew", "Shortle"));
		
		//#9: Write a method that takes an array of int 
		//and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("Answer to #9:");
		//int[] nums = new int[] {12, 24};
		//100 = false
		//int[] nums = new int[] {12, 24, 36, 28};
		//101 = true;
		//int[] nums = new int[] {12, 24, 36, 28, 1};
		int[] nums = new int[] {10, 20, 30, 40, 50, 60};
		System.out.println(ifSumGreaterThan100(nums));
		
		//#10: Write a method that takes an array of double 
		//and returns the average of all the elements in the array.
		System.out.println("Answer to #10:");
		double[] numbers = new double[] {10.0, 27.1, 35.25, 40.5, 51.75, 108.25, 110.1, 106.2};
		//System.out.println(numbers.length);
		//Should return 61.14
		System.out.println("Average: " + averageNumbers(numbers));
		
		//#11: Write a method that takes two arrays of double and 
		//returns true if the average of the elements in the first array 
		//is greater than the average of the elements in the second array.
		System.out.println("Answer to #11:");
		//Using double[] numbers as indicated in Problem 10.
		double[] numbers2 = new double[] {12.25, 25, 37.75, 50, 62.25, 75, 87.75, 100};
		//double[] numbers2 = new double[] {100.2, 110.3, 120.4};
		//double[] numbers2 = new double[] {10.0, 27.1, 35.25, 40.5, 51.75, 108.25, 110.1, 106.2};
		System.out.println(comparing2DoubleArrays(numbers, numbers2));
		
		//#12: Write a method called willBuyDrink that takes a 
		//boolean isHotOutside, and a double moneyInPocket, 
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("Answer to #12:");
		System.out.println(willBuyDrink(true, 11));
		System.out.println(willBuyDrink(false, 11));
		System.out.println(willBuyDrink(true, 9.25));
		System.out.println(willBuyDrink(false, 8.50));
		System.out.println(willBuyDrink(true, 10.50));
		
		//#13: 13.	Create a method of your own that solves a problem. 
		//In comments, write what the method does and why you created it.
		System.out.println("Answer to #13:");
		int[] familyAges = new int[] {23, 22, 59, 60, 70, 92};
		System.out.println("Average age of my family: " + averageFamilyAges(familyAges));
		//I created this method on behalf of my family ages. I'm 23, my brother is 22, my father is 59,
		//my mother is 60, one of my uncles is 70, and my grandmother is 92. In my method, averageFamilyAges,
		//I created an integer array of 6 elements, then in the method, I add up the ages and divide it by the
		//length to get the average age. The average age of my family is 54.33 years old.
		
	}
	
	//#7:
	public static String concat(String word, int n) {
		String repeat = "";
		for(int i=0; i < n; i++) {
			repeat += word;
		}
		return repeat;
	}
	
	//#8:
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//#9:
	public static boolean ifSumGreaterThan100(int[] nums) {
		int sum = 0;
		for(int i=0; i < nums.length; i++) {
			sum += nums[i];
		}
		if(sum > 100) {
			return true;
		}
		return false;
	}
	
	//#10:
	public static double averageNumbers(double[] numbers) {
		double sum = 0;
		for(int i=0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double average = sum / (double) numbers.length;
		return average;
	}
	
	//#11:
	public static boolean comparing2DoubleArrays(double[] numbers, double[] numbers2) {
		double sum = 0;
		for(int i=0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double average1 = sum / (double) numbers.length;
		
		sum = 0;
		for(int i=0; i < numbers2.length; i++) {
			sum += numbers2[i];
		}
		double average2 = sum / (double) numbers2.length;
		if(average1 > average2) {
			return true;
		}
		return false;
	}
	
	//#12:
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			System.out.println("Buy a drink!");
			return true;
		}
		System.out.println("Either it's cold and/or don't have enough money for a drink!");
		return false;
	}
	
	//#13:
	public static double averageFamilyAges(int[] familyAges) {
		int sum = 0;
		for(int i=0; i < familyAges.length; i++) {
			sum += familyAges[i];
		}
		double average = (double) sum / familyAges.length;
		return average;
	}
	
}
