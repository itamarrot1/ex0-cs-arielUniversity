package assignments.Ex0;

import java.util.Scanner;

/**
 * This class is a basis for Ex0 (your first assigment),
 * The definition of the Ex0 can be found here: https://docs.google.com/document/d/1UtngN203ttQKf5ackCnXs4UnbAROZWHr/edit?usp=sharing&ouid=113711744349547563645&rtpof=true&sd=true
 * You are asked to complete the functions below amd may add additional functions if needed.
 */
public class Ex0 {
    public final static long ID = 322530460;

    /**
     *  isPrime :
     *
     * -This function is getting parm "n" from type-long(when we want to work with big numbers )
     * -Checking if "n" is a prime number
     * -In this function I try to find out if a number is prime , with as few unnecessary calculations as possible.
     * -To do this, I use the square root and by dividing by 2 .
     * -If "n" is a prime number return true.
     * -If "n" is not a prime number return false.

     * Pseudocode:
     * -- input  :( n > 1) // As we know a prime number must be greater than 1.
     * -- if ( n%2 == 0  AND  n =! 2 )  { // 2 is the only prime number that can divided by 2.
     * -- return false   //  if n is divided by 2 that mean he isnt a prime number .
     * -- else if (n==2)   return true
     * -- else
     * -- int p = 3 // we want to check if "n" is divided only by a odd-number.
     * -- int i =  sqr(n) // we want to know the "limit" of our calculation by getting his square root.
     * -- while (p < i) // running from 3 till the sqr of "n".
     * -- if (n%p == 0 ) //
     * -- return false // there is a number diffrent from "n" and 1 that dividing "n"
     * -- else return true // there is no number that dividing "n"  (natural number)
     * -- p = p+2 // because we want to check  only odd numbers
     *
     */
    public static boolean isPrime(long n) {
        if (n<2){
            return false;
        }
        if (n % 2 == 0 && n != 2 ) { // check if n is divided by 2 and not 2
            return false; // if yes it means he is not prime
        } else if (n == 2) { // if n = 2 return true
//            System.out.print(n);
            return true;
        } else { // if n is not 2 and not divided by 2 continue to here
            int p = 3; // this is the first potential divider that can break the law of prime
            double i = Math.sqrt(n); //  calc the
            while (i >= p) { // 5
                if (n % p == 0) {  //
                    return false;
                } else {
                    p = p + 2; // add 2 every time
                }
            }
            return true; // if the while loop ended its means that there is no dividers
        }
    }

    /// ////////////////////
    ///
    /**
     - This function is getting two numbers ("s" ,"n" ) and find the smallest  pair of prime numbers ("n" was asked to be even)
     that the differance between them is "n" , starting from the value of "s".
     - p2 = p1 +n is the structure that we will use , "p1" is starting from the value of  "s" and with a while loop
     - we will check every number from "s" and up .
     - we will also use "getPrime" function to check every time if both "p1" and "p2" are prime numbers.
     - the function will return the value of "p1" .
     */
    /**
     * input : s,n > 0 , n%2 == 0     // "s" is a positive and "n" is  even positive
     * flag == false                  // we will use it to stop or continue the loop
     * while ( !flag)                 // starting the loop and make it run till we tell him otherwise
     * if ( isPrime(s))    // check by the previous function if "s" is prime
     *  long p3 = s + n                  // "p3" for saving the sum
     * if (isPrime(p3) == true )  // check if p3 is prime
     * return s         // return the value if the sum is prime
     * else s++        // if not "+1" to "s" and try again
     * else s++         // this is the "else" for the first check
     *
     */

    public static long getPrimePair(long start, long n) {
        long ans = -1;
        boolean flag = false;
        if (n >= 2 && n % 2 == 0) {
            /// Add your code below ///
            while (!flag) {
                if (isPrime(start)) {
//                System.out.println("this is p1,the first prime number" +" "+ start );
                    long p3 = start + n;
//                System.out.println("the sum of start and n is :" + " " + p3);
                    if (isPrime(p3)) {
//                    System.out.println( p3);
                        ans = start;
                        flag = true;
                    } else {
//                    System.out.println("p3 isnt a prime number ");
                        start++;
                    }
                } else {
//                    System.out.println("start is not a prime number " + start);
                    start++;
                }

            }


            /// ////////////////// ///
        }
        return ans;
    }

    /**
     * This function getting two numbers ("s" , "n")  and checking :
     * if "s" is a prime number
     * if  "s" + "n" is a prime number
     * if between s and the sum of s + n there is no prime number
     */
    /**
     * input: ( s,n > 0 n%2==0 )     // "s" is a positive and "n" is  even positive
     * flag == false                // we will use it to stop or continue the loop
     * long i = s                   // this var will store the value of the current low prime number ;
     * while (flag == false )
     * long temp  = getPrimePair ( i , n) // this will check and store the low prime  from "i" and "n"
     * int start  = i+1                    // we dont want to check "i" cause he is prime , so we will start from i+1.
     * int end = s+n                    // the value of the bigger number in the pair
     * boolean foundPrime = false      // we want to stop the loop if we didnt found primes between
     * while ( start < end )            //open loop that running throgh all the numbers between "s" and "n"
     * if (isPrime(start))     // start to check if there is any prime number in the range
     * i = start                        // if there  is , s will be start because we know "start" is a prime number
     * else                             // if  we didnt find prime number in the range
     * i++                                // "+1" to "s"
     * if(!foundprime)    ;                  // if we loop through all the range and didnt find a prime number
     * flag = true;
     * ans = temp ;                         // the low prime number
     *
     * return ans ;
     */
    public static long getClosestPrimePair(long start, long n) {
        long ans = -1;

        if (n % 2 == 0 && n > 1) {
            ans = start;
            long temp = getPrimePair(ans, n); // first pair
            while (true) {
                long lower = temp + 1;
                long higher = temp + n;
                boolean foundPrimeBetween = false;

                while (lower < higher) {
                    if (isPrime(lower)) {
                        ans = lower;
                        temp = lower;
                        foundPrimeBetween = true;
                        break;
                    }
                    lower++;
                }

                if (foundPrimeBetween) {
                    // we found a prime in between check new pair
                    temp = getPrimePair(temp, n);
                } else {
                    // no primes in between  we found the closest pair
                    ans = temp;
                    break;
                }
            }
        }

        return ans;
    }




    /// ////////////////// ///


    /**
     * This function is getting two number ("m" , "n") and checking :
     * if n + p5 = p6  , we will start p5 from 2 - the first prime number
     * if there is no prime numbers between  p5 and p6
     * if there is no prime number between them we will use "p5"
     * the function check how much Prime pairs there is below "p5"
     * if there is exactly "m" pairs below "p5"

     */

    /**
     * input ( m >=0  , n%2 == 0  )
     * flag == true
     * int p5 = 2                                           // the first prime number
     * int counter = 0                                   // this var will help us to count how much pair there is before p5
     * while ( flag == false )                           // keep the loop active
     * long currentPair = getClosestPrimePair(p5, n);   // give us the first closest prime pair
     * if (currnetPair > 0 )                                // we check if "currentPair" pair actually have a value
     * long couple = currentPair+n                          // we want to get "currnetPair" couple prime number
     * if (counter == m )                                       //chcek if this is the number  of couple the user asked for
     * return currnetPair                                             // if it is return the value of currnetPair
     * else                                                 // if this is not the number
     * counter++                                             // we got the first closest prime pair so we count it
     * p5= couple                                            // p5 will be the next prime number to check;
     * return 2                                             //   if none of the conditions happen return 2;
     *
     *
     */

    public static long getMthClosestPrimePair(int m, long n) {
        boolean flag = false;
        if (m < 0 | n < 0 | n % 2 != 0) {
            System.err.println("Invalid input: got m=" + m + ", n=" + n + "  |  m should be >=1 & n should be a positive even integer ");
            return -1;
        }
        long p5 = 2;  // first prime number
        long counter = 0; // for checking  m
        /// Add your code below ///
        while (!flag) {
            long currentPair = getClosestPrimePair(p5, n);
            if (currentPair > 0) { // if the sum of p5 and n is prime ;
                long couple = currentPair + n;
//                System.out.println(currentPair + " and " + " " + couple + " are the " + counter + " closest prime pair with differnce of: " + n);
                if (counter == m) {
//                    System.out.println("func test counter and m");
                    return currentPair;
                } else {
                    counter++;
                    p5 = couple;
                }

            }
        }
        return 2;
        /// ////////////////// ///
    }

}


/// //////// Priate Functions - you are welcome to add additional (private) functions below.



