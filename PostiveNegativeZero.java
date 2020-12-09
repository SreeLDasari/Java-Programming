
public class PostiveNegativeZero {

	public static void main(String[] args) {
		posnegzero(-1);
		posnegzero(22);
		posnegzero(0);
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);
	}
	
	public static void posnegzero(int num) {
		if(num<0) {
			System.out.println("Negative");
		}else if(num>0) {
			System.out.println("Positive");
		}else {
			System.out.println("zero");
			
		}
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour<0) {
			System.out.println("Invalid Value");
			return -1;
		}else {
			long milesPerHour=(long)Math.round((kilometersPerHour / 1.609)); 
			System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
			return milesPerHour;
		}
	}
	public static void printConversion(double kilometersPerHour) {
		toMilesPerHour(kilometersPerHour);
	}

}
