

public class GuessingGame {

	public static void main(String[] args) {

		int min = 0;
		int max = 0;

		if (args.length < 1 || args.length > 1) {
		min = 0;
		max = 1000;
		Guesser guesser = new Guesser(min, max);
                guesser.start();
		}
		else {
		min = Integer.parseInt(args[0]);
                max = Integer.parseInt(args[1]);
                Guesser guesser = new Guesser(min, max);
                guesser.start();
		}

	}

}
