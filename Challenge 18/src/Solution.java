import java.io.BufferedReader;
import java.io.IOException;
import ''java.io.InputStreamReader;


public class Solution {
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int sum  = 75;
	for(int i=0;i<14;i++){
		String sum1 = br.readLine();
		//System.out.println(sum1);
	    String[] temp = sum1.split(" ");
	    int num = Integer.parseInt(temp[i]);
	    sum = sum +num;
	}
	System.out.println("The sum is " + sum);
	
}
}
