
public class TeenNumChecker {

	public static void main(String[] args) {
		

		System.out.println(hasTeen(9, 99, 19));  //should return true since 19 is in range 13 - 19

		System.out.println(hasTeen(23, 15, 42));  //should return true since 15 is in range 13 - 19

		System.out.println(hasTeen(22, 23, 34)); // should return false since numbers 22, 23, 34 are not in range 13-19


		System.out.println(isTeen(9));//  should return false since 9 is in not range 13 - 19

 		System.out.println(isTeen(13)); // should return true since 13 is in range 13 - 19


	}
	public static boolean isTeen(int n1) {
		if(n1>=13 && n1<=19) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean hasTeen(int num1,int num2,int num3) {
		if(isTeen(num1)||isTeen(num2)||isTeen(num3)) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
