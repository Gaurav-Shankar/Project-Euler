
public class SearchFuncs {

	public static boolean LinerSearch(int A[],int item){
		boolean res = false;
		for(int i=0;i<A.length;i++){
			if(item == A[i]){
				res = true;
				return res;
			}
		}
		return res;
	}
}
