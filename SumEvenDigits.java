
public class SumEvenDigits {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(123456789)); 
		System.out.println(getEvenDigitSum(-22)); 
	}
	public static int getEvenDigitSum(int num) {
		if(num<0) {
			return -1;
		}
		int evendigit=0,n=num,rem=0,sum=0;
		
		while(n!=0) {
			rem=n%10;
			n=n/10;
			//System.out.println(rem);
			if(rem%2==0) {
				sum=sum+rem;
				
			}
		}//System.out.println(sum);
		return sum;
		
	}
}
