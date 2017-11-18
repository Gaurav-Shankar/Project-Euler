import java.math.BigInteger;


public class Library {
public static BigInteger factorial(int n){
	BigInteger prod = BigInteger.ONE;
	for(int i=2;i<=n;i++){
		prod = prod.multiply(BigInteger.valueOf(i));
		System.out.println(prod);
	}
	System.out.println(prod);
	return prod;
	
}


}
