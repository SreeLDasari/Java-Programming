
public class flourPacker {

	public static void main(String[] args) {
		
		System.out.println(canPack (1, 0, 4));
		System.out.println(canPack (1, 0, 5));
		System.out.println(canPack (1, 5, 4));
		System.out.println(canPack (2,2,11));
		System.out.println(canPack (-3,2,12));
		
		
		
	}
	public static boolean canPack(int bigCount,int smallCount,int goal) {
		
		if(bigCount<0 || smallCount<0 || goal<0) {
			return false;
		}
		int bigbagCount=bigCount*5;
		int smallbag=smallCount*1;
		int sgoal=goal%5;
		if((goal<=bigbagCount+smallbag) &&(smallCount>=sgoal) ) {
		return true;
		}else {
			return false;
		}
		
	}

}
