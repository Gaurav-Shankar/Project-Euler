import java.math.BigInteger;

/*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
*/
public class Solution {
public static void main(String[] args) {
    int sum=0;
    int digit;
    BigInteger prod = new BigInteger("1");
    BigInteger b = new BigInteger("2");
	for(int i=1;i<=1000;i++){
		prod = prod.multiply(b);
	}
	String num = prod.toString();
	for(int i=0;i<num.length();i++){
		digit =  num.charAt(i) - '0';
		sum = sum + digit;
	}
	System.out.println(sum);
	
}
}
