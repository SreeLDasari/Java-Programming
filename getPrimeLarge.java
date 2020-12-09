
public class getPrimeLarge {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		//System.out.println(getLargestPrime(217));
		//System.out.println(getLargestPrime(0));
		//System.out.println(getLargestPrime(45));
		//System.out.println(getLargestPrime(-1));

	}
	
	public static int getLargestPrime(int number) {
        
		boolean dp[] = new boolean[number];
		
		for(int i = 0 ; i < number; i++) {
			dp[i] = true;
		}
		
		int result = -1;
		
		dp[0] = false;
		dp[1] = false;
		for (int i = 2; i < Math.sqrt(number);i++) {
			
			
			if(dp[i] == true) {
				
				for(int j = i * i; j < number; j = j + i) {
					dp[j] = false;
				}
			}
		}
		
		
		
		for(int i = 0; i <number ; i++ ) {
			
			if( dp[i] ==  true) {
				
				System.out.println(i);
				
				
				result = i;
			}
		}
		
		
		return result;
		
		
		
		
		
		
		
    }
	
	
}
