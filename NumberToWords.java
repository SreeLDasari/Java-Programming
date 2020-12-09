
public class NumberToWords {

	public static void main(String[] args) {

		numberToWords(123);
		numberToWords(1010); 
		numberToWords(1000);
		numberToWords(-12);
		//System.out.println(getDigitCount(123));
		
	}
	public static void numberToWords(int num) {
		if(num<0) {
			System.out.println("Invalid Value");
		}
		int last=0,number=reverse(num);
		int digitC=getDigitCount(num);
		while(digitC>0) {
		last=number%10;
		number=number/10;
		digitC--;
		switch(last) {
		case 0:System.out.println("Zero");
			break;
		case 1:System.out.println("One");
		break;
		case 2:System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		case 4:System.out.println("Four");
		break;
		case 5:System.out.println("Five");
		break;
		case 6:System.out.println("Six");
		break;
		case 7:System.out.println("Seven");
		break;
		case 8:System.out.println("Eight");
		break;
		case 9:System.out.println("Nine");
		break;
		}
	}
		
		
	}
	public static int reverse(int numRev) {
		int rev=0,rem,quo,n;
		n=numRev;
		
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		return rev;
	}
	
	public static int getDigitCount(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0) {
			return 1;
		}
		
		int count=0,rev=0,rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			count++;
			
		}return count;
		
	}

}
