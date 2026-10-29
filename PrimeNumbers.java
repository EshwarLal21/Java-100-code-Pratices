public class PrimeNumbers {
    public static void main(String[] args) {

        for (int num = 2; num <= 600; num++) {
            boolean isPrime = true;

            // check divisor from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // if prime → print
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
