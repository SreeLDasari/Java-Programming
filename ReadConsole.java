import java.util.Scanner;

public class ReadConsole {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.nextLine();
		System.out.println(num);
		String name=scan.nextLine();
		System.out.println(name);
	}

}
