
public class AreaCalculator {

	public static void main(String[] args) {
	

		System.out.println(area(5.0)); //should return 78.53975

		System.out.println(area(-1));  //should return -1 since the parameter is negative

		System.out.println(area(5.0, 4.0));// should return 20.0 (5 * 4 = 20)

		System.out.println(area(-1.0, 4.0)); // should return -1 since first the parameter is negative


	}
	public static double area(double radius) {
		if(radius<0) {
			return -1;
		}
		return (radius*radius*Math.PI);
		
	}
	public static double area(double s1,double s2) {
		if(s1<0 || s2<0) {
			return -1;
		}
		return s1*s2;
	}

}
