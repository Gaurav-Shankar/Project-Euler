import java.io.*;
public class Solution {
	public static void main(String[] args) throws  Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0){
			int count=0;
			String line = br.readLine();
			String temp = new StringBuilder(line).reverse().toString();
			if(line.equalsIgnoreCase(temp)){
				System.out.println(count);
			}
			else if(line.length()%2 != 0){
				int mid = line.length()/2;
				int j = mid-1;
				for(int i=mid+1;i<line.length();i++){
					int p = String.valueOf(line.charAt(i)).codePointAt(0);
					int c1 = String.valueOf(line.charAt(j)).codePointAt(0);
					if((c1 != p)){
						while(c1 !=p){
							p--;
							count++;
						}
					}
					j--;
				}
				System.out.println(count);
			}
			else{
				int mid = line.length()/2;
				int j = mid-1;
				for(int i=mid;i<line.length();i++){
					int p = String.valueOf(line.charAt(i)).codePointAt(0);
					int c1 = String.valueOf(line.charAt(j)).codePointAt(0);
					if((c1 != p)){
						while(c1 !=p){
							p--;
							count++;
						}
					}
					j--;
				}
				System.out.println(count);
			}
		}
	}
}
