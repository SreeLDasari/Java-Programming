
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(5));
		System.out.println(isPerfectNumber(-1));
	}
	public static boolean isPerfectNumber(int num) {
		int n,sum=0;
		n=num;
		if(num<1) {
			return false;
		}
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
				if(sum==num) {
					return true;
				}
				
			}
		}return false;
		
	}

}
