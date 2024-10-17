package topic_5_recursion;

public class ArraySum {
	
    public int sum(int[] arr, int n) {
        // Base case: if the array is empty
        if (n <= 0) {
            return 0;
        }

        // Recursive case: sum of the last element and the sum of the rest
        return arr[n - 1] + sum(arr, n - 1);
    }

	public static void main(String[] args) {
		
		ArraySum calculator = new ArraySum();
        
        int[] numbers = {1, 2, 3, 4, 5}; 
        int result = calculator.sum(numbers, numbers.length);
        
        System.out.println("Sum of the array is: " + result);
		

	}

}
