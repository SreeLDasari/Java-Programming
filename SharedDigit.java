
public class SharedDigit {

	public static void main(String[] args) {
		
		System.out.println(hasSharedDigit(12,23));
		System.out.println(hasSharedDigit(9,99));
		System.out.println(hasSharedDigit(15,55));


		
	}
	
	public static boolean hasSharedDigit(int d1,int d2) {
		
		int firstd1,secd1,firstd2,secd2;
		
		if((d1>=10) && (d1<=99) && (d2>=10) && (d2<=99)) {
			
			firstd1=d1%10;
			secd1=d1/10;
			firstd2=d2%10;
			secd2=d2/10;
			if(firstd1==firstd2 || firstd1==secd2 || secd1==firstd2 || secd1==secd2) {
				return true;
			}
			
		}return false;
	}

}
