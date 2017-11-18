

public final class Solution implements EulerSon{
	public static void main(String[] args)  {
		System.out.println(new Solution().run());
	}

	@Override
	public String run() {
		
		// TODO Auto-generated method stub
		String temp = Library.factorial(100).toString();
		int sum=0;
		//System.out.println(temp.length());
		for(int i=0;i<temp.length();i++){
			sum = sum + temp.charAt(i)-'0' ;
			//System.out.println(sum);
		}
		return Integer.toString(sum);
	}
}

