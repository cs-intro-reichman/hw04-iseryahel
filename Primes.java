public class Primes {
    public static void main(String[] args) {
final int N = Integer.parseInt(args[0]); // the length of the arr

        boolean[] isPrime = new boolean[N + 1]; //new arr

        for (int i = 2; i <= N; i++) { // put true in everything
            isPrime[i] = true;
        }

        int p = 2;
        while (p * p <= N) 
            { // Sieve of Eratosthenes: Algorithm
                if (isPrime[p]) 
                {
                    for (int multiple = p * p; multiple <= N; multiple += p) {
                        isPrime[multiple] = false;
                    }
                }
                p++;
          }

        System.out.println("Prime numbers up to " + N + ":");// print the primes
        int count = 0; // how many primes
        for (int i = 2; i <= N; i++) 
            {
                if (isPrime[i]) // print the primes
                {
                    System.out.println(i);
                    count++;
                }
           }
        int percentage = (int) Math.round((count * 100.0) / (N)); // precent calculate
        System.out.println("There are " + count + " primes between 2 and " + N +" (" + percentage + "% are primes)");
    }
}

