
public class Solution {
	static boolean CheckDiv(long num){
		boolean res = false;
		for(long i=2;i<=10;i++){
			if(num%i == 0){
				res = true;
			}
			else{
				return false;
			}
		}

		return res;

	}
	public static void main(String[] args) {
		long i=22L;
		boolean res1;
		do{
			res1 = CheckDiv(i);
			if(res1){
				System.out.println(i);
				break;
			}
			i = i + 2;

		}while(res1!= true);


	}
}
