// Class to find Mersenne primes
// Mersenne primes are primes of the form 2^n - 1
public class MersennePrimes {
 public static void main(String[] args) {
 
 int n = 2;
 // Lets go through all powers of 2
 // Shouldn’t be a problem...
 while ( true ) {
 int possiblePrime = (int)Math.pow(2,n) - 1;
 // Class isPrime method from PrimeNumberMethod class
 // to check if it is a prime
 if (PrimeNumberMethod.isPrime(possiblePrime)) {
 System.out.println("2^" + n + " - 1 = "
 + possiblePrime
 + " is a Mersenne Prime!");
 }
 //System.out.println(possiblePrime);
 n++;
 }
 }
}