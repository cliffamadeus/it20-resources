package topic_5_recursion;

public class Fibonacci {
	 public int fibonacci(int n) {
	        // Base cases
	        if (n == 0) return 0;
	        if (n == 1) return 1;

	        // Recursive case
	        return fibonacci(n - 1) + fibonacci(n - 2);
	  }
	 

	 public static void main(String[] args) {
	        Fibonacci calculator = new Fibonacci();
	        
	        int number = 6; 
	        int result = calculator.fibonacci(number);
	        
	        System.out.println("Fibonacci number at position " + number + " is: " + result);
	 }

}
