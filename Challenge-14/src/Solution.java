
public class Solution {
public static void main(String[] args) {
	int num = 1000000;
	int count = 0;
	for(long i=1000000;i>1;i--){
		System.out.println(i);
		int temp =0;
	while(num!=1){
		if(num % 2 == 0){
			num = num/2;
			temp++;
		}
		else{
			num = 3*num + 1;
			temp++;
		}
		if(temp > count){
			count = temp;
		}
	}
	}
	System.out.println(count);
}
}
