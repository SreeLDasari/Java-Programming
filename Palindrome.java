
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}
	
	public static boolean isPalindrome(int n) {
		int rev=0,rem=0,num=0;
		num=n;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		//System.out.println(n+"  "+rev);
		if(n==rev) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
