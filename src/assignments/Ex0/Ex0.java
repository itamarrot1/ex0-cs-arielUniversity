package assignments.Ex0;
/**
 * This class is a basis for Ex0 (your first assigment),
 * The definition of the Ex0 can be found here: https://docs.google.com/document/d/1UtngN203ttQKf5ackCnXs4UnbAROZWHr/edit?usp=sharing&ouid=113711744349547563645&rtpof=true&sd=true
 * You are asked to complete the functions below amd may add additional functions if needed.

 */
public class Ex0 {
    public final static long ID = 123456789;
    /**
     -This function is getting parm "n" from type-long(when we want to work with big numbers )
     -Checking if "n" is a prime number
     -In this function I try to find out if the number is prime with as few unnecessary calculations as possible.
     -To do this, I use the square root and by dividing by 2 .
     -If "n" is a prime number return true
     -If "n" is not a prime number return false

     Pseudocode:
     -- input  :( n > 1) // As we know a prime number must be greater than 1.
     -- if ( n%2 == 0  AND  n =! 2 )  { // 2 is the only prime number that can divided by 2.
     -- return false   //  if n is divided by 2 that mean he isnt a prime number .
     -- else   return true
     -- int p = 3 // we want to check if "n" is divided only by a odd-number.
     -- int i =  sqr(n) // we want to know the "limit" of our calculation by getting his square root.
     -- while (p>= i) // running from 3 till the sqr of "n".
     -- if (n%p == 0 ) //
     -- return false // there is a number diffrent from "n" and 1 that dividing "n"
     -- else return true // there is no number that dividing "n"  (natural number)
     -- p = p+2 // because we want to check  only odd numbers
     *
     */
    public static boolean isPrime(long n) {
        boolean ans = true;
        if(n==2) {ans = true;}
        else {
            if(n<2 || n%2==0) {ans = false;}
        }
        long p = 3;
        while (ans && p<n) {
            if(n%p==0) {ans = false;}
            p = p + 2;
        }
        return ans;
    }
    /// ////////////////////
    ///
    /**
     - This function is getting two numbers ("s" ,"n" ) and find the smallest  pair of prime numbers ("n" was asked to be even)
        that the differance between them is "n" , starting from the value of "s".
        p2 = p1 +n is the structure that we will use , "p1" is starting from the value of  "s" and with a while loop
        we will check every number from "s" and up .
        we will also use "getPrime" function to check every time if both "p1" and "p2" are prime numbers.
        the function will return the value of "p1" .
     */
    /**
     * input : s,n > 0 , n%2 == 0     // "s" is a positive and "n" is  even positive
     * flag == true                  // we will use it to stop or continue the loop
     * while ( flag == true)        // starting the loop
     * if ( isPrime(s) == true )    // check by the previous function if "s" is prime
     *      p3 = s + n                  // "p3" for saving the sum
     *      if (isPrime(p3) == true )  // check if p3 is prime
     *      return s  , p3        // return the value if the sum is prime
     *      else s++        // if not "+1" to s and try again
     * else s++ // this is the "else" for the first check
     * */

    public static long getPrimePair(long start, long n) {
        long ans = -1;
        if(n>=2 && n%2==0) {
            /// Add your code below ///

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
     * input: ( s,n > 0 n%2==0 )  // "s" is a positive and "n" is  even positive
     *  flag == true // we will use it to stop or continue the loop
     *  while (flag == true ) //
     *      if (getPrimePair( s , n) ==! null ) //check if the numbers are prime
     *          int start  = s+1
     *          int end = n -1
     *          while ( start < end )  //open loop that running throgh all the numbers between "s" and "n"
     *              if (isPrime(start) == true )  // start to check if there is any prime number in the range
     *                  s++ // add "+1" to s and run again
     *              else // if  we didnt find prime number in the range
     *                  return s //
     *      else  //
     *      s++ // "+1" to "s"
     * */
    public static long getClosestPrimePair(long start, long n) {
        /// Add your code below ///
        long ans = -1;
        return ans;
        /// ////////////////// ///
    }

    /**
     * This function is getting two number ("m" , "n") and checking :
     * if n + p5 = p6  , we will start p5 from 2 - the first prime number
     * if there is no prime numbers between  p5 and p6
     * if there is not prime number between them we will use "p5"
     * the function check how much Prime pairs there is below "p5"
     * if there is exactly "m" pairs below "p5"

     */

    /**
     * input ( m >=0  , n%2 == 0  )
     * flag == true
     * int counter = 0 // this var will help us to count how much pair there is before p5
     * int p5 = 2      // the first prime number
     * while ( flag == true )       // keep the loop active
     *      if ( getClosestPrimePair(p5 ,n ) == null ) // check if the numbers are closest prime pairs by "n"
     *          p5 =p5+1        // if not add 1 to "p5"
     *      else
     *          if (counter == m )  // else check if the counter is equal to the input "m" , the amount of pair we need before "p5"
     *              return "p5"  // if yes return "p5"
     *          else counter++ // if m=! counter add 1 to counter
      */

    public static long getMthClosestPrimePair(int m, long n) {
        if(m<0 | n<0 | n%2!=0) {
            System.err.println("Invalid input: got m="+m+", n="+n+"  |  m should be >=0 & n should be a positive even integer ");
            return -1;
        }
        /// Add your code below ///

        return 2;
        /// ////////////////// ///
    }

    /// //////// Priate Functions - you are welcome to add additional (private) functions below.

}
