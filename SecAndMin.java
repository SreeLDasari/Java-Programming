
public class SecAndMin {

	public static void main(String[] args) {
		getDurationString(65,45);
		System.out.println(getDurationString(600));
	}
	public static String getDurationString(int minutes,int seconds) {
		int hours=minutes/60;
		int remminutes=minutes%60;
		if(minutes<0 || seconds<0 || seconds >59) {
			return "Invalid value";
		}else {
			System.out.println(hours+"h "+remminutes+"m "+seconds+"s");
			return hours+"h "+remminutes+"m "+seconds+"s";
		}
	}
	public static String getDurationString(int seconds) {
		int minutes=0;
		
		if(seconds<0 && seconds>59) {
			return "Invalid value";
		}
			minutes=seconds/60;
			int remseconds=seconds%60;
			
			return getDurationString(minutes,remseconds);
	}
}
