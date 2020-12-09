
public class MegaBytes {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);


	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		int megabytes=kiloBytes/1024;
		int rem_kilobytes=kiloBytes%1024;
		
		if(kiloBytes<0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+rem_kilobytes+" KB ");
		}
	}
}
