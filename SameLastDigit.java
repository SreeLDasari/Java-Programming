
public class SameLastDigit {

	public static void main(String[] args) {

		System.out.println(hasSameLastDigit (41, 22, 71));
		System.out.println(hasSameLastDigit (23,32,42));
		System.out.println(hasSameLastDigit (9,99,999));
		System.out.println(isValid(10));
		System.out.println(isValid(486));
		System.out.println(isValid(1051));
	}
	public static boolean hasSameLastDigit(int d1,int d2,int d3) {
		
		int lastd1,lastd2,lastd3;
		
		if(isValid(d1) && isValid(d2) && isValid(d3)) {
			lastd1=d1%10;
			lastd2=d2%10;
			lastd3=d3%10;
			if(lastd1==lastd2 || lastd1==lastd3 || lastd2==lastd3) {
				return true;
			}
		}else {
			return false;
		}
		return false;
		
		
	}
	public static boolean isValid(int num) {
		if((num<10) || (num>1000)) {
			return false;
		}else {
			return true;
		}
	}

}
