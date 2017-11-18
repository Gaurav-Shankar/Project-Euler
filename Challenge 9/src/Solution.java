/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 */
public class Solution {
public static void main(String[] args) {
	 int sum = 1000;
	 int a=0,b=0;
	 int c = 0;
	 for(a=0;a<=1000/3;a++){
		 for(b=0;b<=1000/2;b++){
			 for(c=0;c<=1000;c++){
				 if(a+b+c == 1000 && a*a + b*b == c*c){
					 System.out.println(a+" " + b + "  " +c);
					 System.out.println(a*b*c);
					 break;
				 }
			 }
		 }
	 }
	
}
}
