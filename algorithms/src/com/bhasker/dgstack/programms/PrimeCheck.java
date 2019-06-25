package com.bhasker.dgstack.programms;

public class PrimeCheck {

    public static void main(String args[]){
        String primeNumberFound = "";
        boolean isPrime = true;
        int primeTill = 120;
        for(int i = 2; i<= primeTill; i++) {
            isPrime = PrimeCheck.getPrime(i);
            if(isPrime){
                primeNumberFound = primeNumberFound +  ' ' + i;
            }
        }

        System.out.println("Found Primes between 2 to "+ primeTill + " is :" +primeNumberFound);

    }

    public static  boolean getPrime(int number){
        int reminder = 0;
        for(int i = 2; i< number/2 ; i++){
            reminder = number % i ;
            if(reminder == 0){
                return false;
            }
        }
        return true;

    }
}
