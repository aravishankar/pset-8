public class Exercises {

	// public static void main(String[] args) {
		
			
	// }

	//this works!
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
	
	public int difference(int[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
