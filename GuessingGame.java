

public class GuessingGame {

	public static void main(String[] args) {

		int min = 0;
		int max = 0;
		min = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[1]);

		Guesser guesser = new Guesser(min, max);
		guesser.start();

	}

}
