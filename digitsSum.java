
public class digitsSum {

	public static void main(String[] args) {
		System.out.println(sumDigits(1));
	}
	public static int sumDigits(int num) {
		if(num<=10) {
			return -1;
		}
		int sum=0,n=0;
		while(num!=0) {
			
			sum=sum+(num%10);
			
			num=(num/10);
		}
		
		
		return sum;
		
		
	}
}
