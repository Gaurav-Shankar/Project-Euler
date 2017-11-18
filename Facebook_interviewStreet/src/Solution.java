
/*
 * Finding Missing terms in a Arithmetic Progression
 */
import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Ap = new int[N];
        for(int i=0;i<N;i++){
        Ap[i] = sc.nextInt();
        }
        int cd = Ap[1] - Ap[0];
         int cd2 = Ap[3] - Ap[2];
        if(cd == cd2)
        {
        for(int i=0;i<N;i++)
        {
        int diff = Ap[i+1] - Ap[i];
            if(diff == cd)
            {
            continue;
            }
            else{
                int num = Ap[i+1] - cd;
                System.out.println(num);
                break;
                }
        }
        }
    }
}
        
        