
public class SumOdd {
	
	public static void main(String[] args) {
		System.out.println(isOdd(4));
		System.out.println(sumOdd(100,1000));
	}
	
	public static boolean isOdd(int number) {
		if(number<0) {
			return false;
		}
		return (number%2!=0); 
	}
	public static int sumOdd(int start,int end) {
		int sum=0;
		if((start>0) && (end>0) &&(end>=start)) {
		for(int i=start;i<=end;i++) {
			if(isOdd(i)) {
				sum+=i;
				
			}
		}
	}else {
		return -1;
	}
		return sum;
	}

}