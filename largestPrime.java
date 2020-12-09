
public class largestPrime {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
	}
	
	 public static int getLargestPrime(int num) {
			
			int count=0;
			if(num<=0) {
				return -1;
			}
			for(int i=1;i<=num/2;i++) {
				if(num%i==0) {
					if(isPrime(i)) {
					count=i;
					}
				}

			}
			return count;
			
			
		}
		public static boolean isPrime(int num) {
			int count1=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count1++;
				}
			}
			if(count1==2) {
				return true;
			}return false;
		}
}
