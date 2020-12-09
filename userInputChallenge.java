import java.util.Scanner;

public class userInputChallenge {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		 int i=0,sum=0;
		while(i<10) {
			System.out.println("Enter number: ");
			if(scan.hasNext()) {
			
			int num=scan.nextInt();
			
			i++;
			sum=sum+num;
			}
			else {
				System.out.println("Invalid Input");
			}
			
		}System.out.println("Sum: "+sum);
		
		
		scan.close();
		
	}

}
