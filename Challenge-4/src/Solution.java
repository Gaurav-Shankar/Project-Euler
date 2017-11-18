/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Solution {
	public static void main(String[] args) {
		int largest = 100;
		int num=0;
		for(int i=100;i<=999;i++){
			for(int j=101;j<=999;j++){
				int mul = i * j;
				String mul1 = Integer.toString(mul);
				String mulR = new StringBuilder(mul1).reverse().toString();
				if(mul1.equalsIgnoreCase(mulR)){
					num = Integer.parseInt(mulR);
					if(num>largest){
						largest = num;
					}
				}
			}
		}
		System.out.println(largest);
	}
}
