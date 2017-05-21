public class TestSumDoubleReverse {
 public static void main(String[] args) {
 // Initialize sum
 double sum = 0;
 // Add 0.01, 0.02, ..., 0.99, 1 to sum
 double currentValue = 1.0;
 for (int count = 0; count < 100; count++) {
 sum += currentValue;
 currentValue -= 0.01;
 }
 // Display result
 System.out.println("The sum is " + sum);
 }
}