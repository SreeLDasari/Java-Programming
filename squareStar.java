
public class squareStar {

	public static void main(String[] args) {
		printSquareStar(5);
		
	}
	public static void printSquareStar(int number) {
	    if (number < 5) {
	        System.out.println("Invalid Value");
	    } else {
	        for (int currentRow = 0; currentRow < number; currentRow++) {
	            for (int currentColumn = 0; currentColumn < number; currentColumn++) {
	                if (currentRow == 0 || currentRow == number - 1 || currentColumn == 0 || currentColumn == number - 1
	                        || currentColumn == currentRow || currentColumn == number - (currentRow + 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}

}
