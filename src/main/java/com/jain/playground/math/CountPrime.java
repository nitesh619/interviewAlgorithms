package com.jain.playground.math;

class CountPrime {

    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isNotPrime[i] == false) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}