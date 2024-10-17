package topic_5_recursion;

public class Factorial {
	
	 public int factorial(int n) {
	        // Base case: factorial of 0 or 1 is 1
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            // Recursive case: n! = n * (n-1)!
	            return n * factorial(n - 1);
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
