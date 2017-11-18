
public class Solution {
public static void main(String[] args) {
	int sum=0;
for(int i=10000;i<=99999;i++){
	String temp = Integer.toString(i);
	if(Math.pow(temp.charAt(0), 5)+Math.pow(temp.charAt(1), 5)+Math.pow(temp.charAt(2), 5)+Math.pow(temp.charAt(3), 5)+Math.pow(temp.charAt(4), 5) == i){
		sum = sum + i;
	}
}
System.out.println(sum);
}
}
