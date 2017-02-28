package home.petko.pc;

public class Methods {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println(highScore);
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition);
	}

	private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
	
	private static void displayHighScorePosition(String playerName, int positionInTable) {
		System.out.println(playerName + " managed to get into position " 
							+ positionInTable + " on the high score table" );
	}
	
	private static int calculateHighScorePosition(int score) {
		if (score > 1000) {
			return 1;
		} else if (score > 500 && score < 1000) {
			return 2;
		} else if (score > 100 && score < 500) {
			return 3;
		} else {
			return 4;
		}
	}
}
