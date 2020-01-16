public class Exercises {

	// public static void main(String[] args) {
		
			
	// }

	//this works
	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false; 
		}
		
		// write your code here

		int lastIndexA = a.length;
		int lastIndexB = b.length;

		if (a[0] == b[0]) {
			return true;
		} else if (a[lastIndexA-1] == b[lastIndexB-1]) {
			return true;
		} else {
			return false;
		}
		
		// return false;	// default return value to ensure compilation
	}
	
	//this works
	public String[] endsMeet(String[] values, int n) {
		// write your code here

		String empty[] = new String[0];

		if (values == null || values.length < n || n < 0) {
			return empty; 
		}

		String result[] = new String[n*2];
		int length = values.length;

		for (int i = 0; i < n; i++) {
			result[i] = values[i];
		}

		int index = n;
		for (int j = n; j < 2*n; j++) {
			result[j] = values[length-index];
			index--;
		}

		return result;
		
		// return null;	// default return value to ensure compilation
	}
	
	//Does not return undefined, otherwise works
	public int difference(int[] numbers) {
		// write your code here
		if (numbers == null || numbers.length < 1) {
			return -1; //wtf is undefined
		}

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}

			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		int difference = largest - smallest;
		return difference;
		
		// return -1;		// default return value to ensure compilation
	}

	//this works
	public double biggest(double[] numbers) {
		// write your code here
		if (numbers == null || numbers.length < 3 || numbers.length%2 == 0) {
			return -1;
		}

		boolean noNegatives = true;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				noNegatives = false;
			}
		}
		if (!noNegatives) {
			return -1;
		}

		double largest = numbers[0];
		int middleIndex = numbers.length / 2;
		int finalIndex = numbers.length-1;
		
		if (numbers[middleIndex] > largest) {
			largest = numbers[middleIndex];
		}
		if (numbers[finalIndex] > largest) {
			largest = numbers[finalIndex];
		}

		return largest;

		
		// return -1;		// default return value to ensure compilation
	}
	
	//what is this grader on
	public String[] middle(String[] values) {
		// write your code here
		String empty[] = new String[0];
		if (values == null || values.length < 3 || values.length%2 == 0) {
			return empty;
		}
		
		boolean containsNull = false;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				containsNull = true;
			}
		}
		if (containsNull) {
			return empty;
		}

		int middleIndex = values.length / 2;
		int firstIndex = middleIndex - 1;
		int lastIndex = middleIndex + 1;

		String[] result = {values[firstIndex], values[middleIndex], values[lastIndex]};

		return result;

		// return null;	// default return value to ensure compilation
	}

	//this works
	public boolean increasing(int[] numbers) {
		// write your code here
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		int lowestNum = numbers[0];
		int middleNum = numbers[1];
		int finalNum = numbers[2];

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
	
	//does this work?  I don't know
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		if (numbers == null || numbers.length < 1) {
			return false;
		}

		boolean isEverywhere = true;
		// for (int i = 1; i < numbers.length-1; i++) {
		// 	if (numbers[i-1] != x && numbers[i] != x && numbers[i+1] != x) {
		// 		isEverywhere = false;
		// 	}
		// }

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

	//this works
	public boolean consecutive(int[] numbers) {
		// write your code here
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		boolean isConsecutive = false;
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] % 2 == numbers[i-1] % 2 && numbers[i] % 2 == numbers[i-2] % 2) {
				isConsecutive = true;
			}
		}

		return isConsecutive;
		
		// return false;	// default return value to ensure compilation
	}
	
	//this works
	public boolean balance(int[] numbers) {
		// write your code here
		if (numbers == null || numbers.length < 2) {
			return false;
		}

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
	
	//this works
	public int clumps(String[] values) {
		// write your code here
		if (values == null) {
			return -1;
		}

		boolean containsNull = false;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				containsNull = true;
			}
		}
		if (containsNull) {
			return -1;
		}

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
