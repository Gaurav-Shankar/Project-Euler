/*
 * Find sum of all primes below 2 million i.e 2000000
 */

public class Solution {

 
 public static void main(String[] args) {
 long sum = 2;
 
 for (int i = 3 ; i < 2000000; i = i+2)
 { 
 
  if (checkPrime(i)) 
  {
   sum += i; 
   System.out.println(i);
  }

 }
System.out.println(sum);
}
 public static boolean checkPrime(int a)
 {
  boolean flag = true;
  
  for(int i = 3 ; i < a ; i = i+2 )
  {
  
  if(a % i == 0 )
  {
  flag = false;
  break;
  }
  }
  
  return flag;
  
  
 }

}