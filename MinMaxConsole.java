import java.util.Scanner;

public class MinMaxConsole {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int min=0;
		int max=0;
		boolean first=true;
		while(true) {
			System.out.println("Enter number: ");
			boolean isAnInt=scan.hasNextInt();
			if(isAnInt) {
				int number=scan.nextInt();
				
				if(first) {
					first=false;
					min=number;
					max=number;
				}
				
				if(number>max) {
					max=number;
				}
				if(number<min) {
					min=number;
				}
				
			}else {
				System.out.println("Invalid");
				break;
			}
			
		}
		System.out.println("Min "+min+" Max "+max);
		scan.close();
	}

}
