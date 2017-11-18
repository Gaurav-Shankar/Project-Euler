public class Solution {
public static void main(String[] args) {
	int sumOfnum = (100 * (100 + 1))/2;
	int SqOfSum = sumOfnum * sumOfnum;
	int SumOfSq = (100 * (100 + 1)* (2*100 + 1))/6;
	System.out.println(SqOfSum - SumOfSq);
}
}
