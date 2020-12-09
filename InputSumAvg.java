import java.util.Scanner;

public class InputSumAvg {

	public static void main(String[] args) {

		inputThenPrintSumAndAverage();
	}
	public static void inputThenPrintSumAndAverage () {
			int sum=0;
			long avg=0;
			int count=0;
		Scanner scan=new Scanner(System.in);
		while(true) {
			//System.out.println("Enter number ");
			boolean dint=scan.hasNextInt();
			if(dint) {
				int num=scan.nextInt();
				sum=sum+num;
				count++;
				avg=Math.round((double)sum/count);
				
			}else {
			//	System.out.println("Invalid value");
				break;
				
			}
		}
		System.out.println("SUM = "+sum+" AVG = "+ avg);
		scan.close();
	}

}
