
public class DogBarking {

	public static void main(String[] args) {

		boolean dog=shouldWakeUp(true,1);
		System.out.println(dog);
		boolean dog1=shouldWakeUp(false,2);
		System.out.println(dog1);
		boolean dog3=shouldWakeUp(true,8);
		System.out.println(dog3);
		boolean dog2=shouldWakeUp(true,-1);
		System.out.println(dog2);
		}
	
	public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
		
		
		if ((hourOfDay>=0 && hourOfDay<=23) &&( barking==true && hourOfDay<8 || barking==true && hourOfDay >22 )) {
			return true;
			
		}else {
			return false;
		}
	}

}
