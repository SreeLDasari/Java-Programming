
public class PrimeNum {

	public static void main(String[] args) {
		System.out.println(isPrime(11));
		int count=0;
		for(int j=10;j<50;j++) {
			if(isPrime(j)) {
				//count++;
				System.out.println(j+" Prime numbers");
//				if(count ==3) {
//					break;
//				}
			}
		}
		
	}
	public static boolean isPrime(int n) {
		
		if(n==1) {
			return false;
		}//math.sqrt can be used to optimise
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				
				return false;
			}
		}
		//System.out.println("Prime num 7 ");
		return true;
		
	}

}
