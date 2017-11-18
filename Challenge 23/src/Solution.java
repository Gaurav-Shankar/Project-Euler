/*
 * 144 is the first fibonacci number to contain 3 digits..
 * what is the first fibonacci number to contain 1000 digits???
 */
import java.math.BigInteger;
public class Solution {
public static void main(String[] args) {
   
       BigInteger a = new BigInteger("1");
    BigInteger b = new BigInteger("1");
    BigInteger c;
    int len;
    int count =2;
    do{
        c = a.add(b);
        count++;
        a = b;
        b = c;
       
        String num = c.toString();
        len = num.length();
       
     
    }while(len<1000);
    System.out.println(count);
       
}
}
