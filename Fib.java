/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public long fib_recurrence( int n) {
        if (n <= 2)
          return 1;
        else{
          return fib_recurrence(n-1) + fib_recurrence(n-2);
        }
    }
     /* These are class methods because...
        No matter what, the way to calculate a 
        Fibonacci number using recursion is 
        always the same and does not depend on 
        any varying factors. 
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public long fib_grade8( int n) {
        long beforePrev = 1;
        long prev = 1;
        while (n > 1){
          long saver = prev;
          prev = beforePrev + prev;
          beforePrev = saver;
          n—-;
        }
        return beforePrev;
    }
    /* Time complexity:
       Consider the size of the problem to be ... n because n
       calculations must be done in order to find the nth
       Fibonacci number. 
       
       As the proxy for the time required, count the number of times 
       you calculate the next value. 
       
       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because it only takes one extra step to get 
       to the next Fibonacci number. 
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public double fib_Binet( int n) {
        return -2; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */
}
