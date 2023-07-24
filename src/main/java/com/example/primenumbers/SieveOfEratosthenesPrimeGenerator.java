package com.example.primenumbers;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenesPrimeGenerator {

    private List<Integer> primes;

    public SieveOfEratosthenesPrimeGenerator() {
        primes = new ArrayList<>();
    }

    public int generatePrimes(int upperBound) {
        primes.clear();

        boolean[] isPrime = new boolean[upperBound + 1];
        for (int i = 2; i <= upperBound; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= upperBound; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= upperBound; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= upperBound; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes.size();
    }
}
