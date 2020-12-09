
public class forLoop {

	public static void main(String[] args) {
		int i=1;
		while(true) {
			if(i==6) {
				break;
			}
			System.out.println(i);

			i++;
		}
		do {
			System.out.println("do"+i);
			i++;
		}while(i!=6);
	
	}

}
