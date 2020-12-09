
public class DecimalComparator {

	public static void main(String[] args) {

		areEqualByThreeDecimalPlaces(3.02322,3.0122);

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));// should return true since numbers are equal up to 3 decimal places.

		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756)); // should return false since numbers are not equal up to 3 decimal places

		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));// should return true since numbers are equal up to 3 decimal places.

		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // should return false since numbers are not equal up to 3 decimal places.

	}
	public static boolean areEqualByThreeDecimalPlaces(double n1 ,double n2) {
		int num1=(int)(n1*1000);
		int num2=(int)(n2*1000);
		//System.out.println((int)(n2*1000));
		if(num1==num2) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
