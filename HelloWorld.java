
class HelloWorld {
	
	
	

	public static void main(String[] args) {
		boolean gameover=true;
		int score=800;
		int levelCompleted =5;
		int bonus=100;
		int val=calculateScore(gameover,score,levelCompleted,bonus);
		System.out.println(val);
		displayHighScorePosition("Katty",1500);
		int v1=calculatehighscore(1500);
		displayHighScorePosition("Katty",v1);

		System.out.println(v1);
		int v2=calculatehighscore(900);
		displayHighScorePosition("Patty",v2);

		System.out.println(v2);
		int v3=calculatehighscore(400);
		displayHighScorePosition("latty",v3);

		System.out.println(v3);
		int v4=calculatehighscore(1000);
		displayHighScorePosition("Katty",v4);

		System.out.println(v4);

		
		
	}
	public static int calculateScore(boolean gameover
			,int score,int levelcompleted,int bonus) {
		if(true) {
			int finalscore=score +(levelcompleted * bonus);
			System.out.println(finalscore);
			return finalscore;
		}
		else {
		return -1;
		}
	}
	public static void displayHighScorePosition(String player,int pos) {
		System.out.println(player+"Managed to "
				+ "get into position"+pos+"on the high score table");
	}
	public static int calculatehighscore(int score) {
		
		if(score>1000) {
			return 1;
		}else if(score>500 || score<1000) {
			return 2;
		}else if(score > 100 && score<500) {
			return 3;
		}
		return 4;
	}

}
