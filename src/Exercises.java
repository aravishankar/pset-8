public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false; 
		}
		
		// write your code here

		//finds endpoints
		int lastIndexA = a.length;
		int lastIndexB = b.length;

		if (a[0] == b[0]) { //compares first value
			return true;
		} else if (a[lastIndexA-1] == b[lastIndexB-1]) { //compares last value
			return true;
		} else {
			return false;
		}
		
		// return false;	// default return value to ensure compilation
	}
	
	public String[] endsMeet(String[] values, int n) {
		// write your code here

		String empty[] = new String[0]; //empty string to return

		//check that conditions are met
		if (values == null || values.length < n || n < 0) {
			return empty; 
		}

		//initialize output array + other things
		String result[] = new String[n*2];
		int length = values.length;
		int index = n;

		//append first n elements
		for (int i = 0; i < n; i++) {
			result[i] = values[i];
		}

		//append last n elements
		for (int j = n; j < 2*n; j++) {
			result[j] = values[length-index];
			index--;
		}

		return result;
		
		// return null;	// default return value to ensure compilation
	}
	
	public int difference(int[] numbers) {
		// write your code here

		//check that conditions are met
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		//initialize net largest and net smallest vars
		int largest = numbers[0];
		int smallest = numbers[0];

		//goes through values, replaces largest or smallest as needed
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		//compute and return difference
		int difference = largest - smallest;
		return difference;
		
		// return -1;		// default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
		// write your code here

		//check that conditions are met
		if (numbers == null || numbers.length < 3 || numbers.length%2 == 0) {
			return -1;
		}

		//check that no negatives condition is met 
		boolean noNegatives = true;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				noNegatives = false;
			}
		}
		if (!noNegatives) {
			return -1;
		}

		//initialize variables
		double largest = numbers[0];
		int middleIndex = numbers.length / 2;
		int finalIndex = numbers.length-1;
		
		//finds if middle or final numbers are largest
		if (numbers[middleIndex] > largest) {
			largest = numbers[middleIndex];
		}
		if (numbers[finalIndex] > largest) {
			largest = numbers[finalIndex];
		}

		return largest;

		// return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here

		String empty[] = new String[0];  //empty string to return

		//check that conditions are met
		if (values == null || values.length < 3 || values.length%2 == 0) {
			return empty;
		}
		
		//check that no null condition is met
		boolean containsNull = false;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				containsNull = true;
			}
		}
		if (containsNull) {
			return empty;
		}

		//finds middle 3 elements
		int middleIndex = values.length / 2;
		int firstIndex = middleIndex - 1;
		int lastIndex = middleIndex + 1;

		String[] result = {values[firstIndex], values[middleIndex], values[lastIndex]};

		return result;

		// return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here

		//checks that conditions are met
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		//initialize sequence vars
		int lowestNum = numbers[0];
		int middleNum = numbers[1];
		int finalNum = numbers[2];

		//iterates through array for increasing sequences
		for (int i = 0; i < numbers.length; i++) {
			if (lowestNum < middleNum && middleNum < finalNum) {
				return true;
			}

			if (i + 2 < numbers.length) {
				lowestNum = numbers[i];
				middleNum = numbers[i + 1];
				finalNum = numbers[i + 2];
			} else {
				return false;
			}

		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here

		//checks that conditions are met
		if (numbers == null || numbers.length < 1) {
			return false;
		}

		//calculates if everywhere condition is met
		boolean isEverywhere = true;
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				if (numbers[i] != x && numbers[i+1] != x) {
					isEverywhere = false;
				}
			} else if (i == numbers.length - 1) {
				if (numbers[i] != x && numbers[i-1] != x) {
					isEverywhere = false;
				}
			} else {
				if (numbers[i-1] != x && numbers[i] != x && numbers[i+1] != x) {
					isEverywhere = false;
				}
			}
		}

		return isEverywhere;
		
		// return false;	// default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		//checks that conditions are met
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		//verifies if sequence of 3 or more even/odd numbers are present
		boolean isConsecutive = false;
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] % 2 == numbers[i-1] % 2 && numbers[i] % 2 == numbers[i-2] % 2) {
				isConsecutive = true;
			}
		}

		return isConsecutive;
		
		// return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here

		//checks that conditions are met
		if (numbers == null || numbers.length < 2) {
			return false;
		}

		//verifies if balancing condition is met
		for (int i = 0; i < numbers.length; i++) {
			int firstSum = 0;
			int secondSum = 0;
			for (int j = 0; j < i; j++) {
				firstSum += numbers[j];
			}
			for (int k = i; k < numbers.length; k++) {
				secondSum += numbers[k];
			}
			if (firstSum == secondSum) {
				return true;
			}
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here

		//checks if conditions are met
		if (values == null) {
			return -1;
		}

		//checks if no null condition is met
		boolean containsNull = false;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				containsNull = true;
			}
		}
		if (containsNull) {
			return -1;
		}

		//find clumps and tally them
		boolean isClump = false;
		int clumpCount = 0;

		for (int i = 1; i < values.length; i++) {
			if (values[i].equals(values[i-1])) {
				if (!isClump) {
					clumpCount++;
				}
				isClump = true;
			} else {
				isClump = false;
			}
		}

		return clumpCount;
		
		// return -1;		// default return value to ensure compilation
	}
}
