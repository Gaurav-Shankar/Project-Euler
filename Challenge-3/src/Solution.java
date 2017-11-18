/*
 * Find largest prime factor of 600851475143 
 */

public class Solution {

	public static boolean checkPrime(long a)
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


 public static void main(String[] args) {
	 long num = 600851475143L;
	 int largest = 0;
	 for(long i=2;i<Math.sqrt(num);i++){
		 if(num%i == 0){
			if(checkPrime(i)){
				largest = (int) i;
			}
		 }
	 }
	 System.out.println(largest);
 }
  

 }