
public class evenNum {

	public static void main(String[] args) {

		int start=4,finish=20,count=0,sum=0;
		while(start<=finish) {
			if(isEven(start)) {
				count++;
				if(count==5) {
					
					break;
				}
			}
			start++;
			
		}
		
	}
	public static boolean isEven(int num) {
		if((num%2)==0)
		{
			System.out.println(num);
			return true;
		}else {
			return false;
		}
	}
}
