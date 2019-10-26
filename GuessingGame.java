

public class GuessingGame {

	public static void main(String[] args) {

		int min = 0;
		int max = 0;

		if (args.length < 1 || args.length > 1) {
		usage();
		System.exit(1);
		}
		else {
		min = Integer.parseInt(args[0]);
                max = Integer.parseInt(args[1]);
                Guesser guesser = new Guesser(min, max);
                guesser.start();
		}

}
private static void usage() {
System.out.println("Usage: java GuessingGame low high" +
 "\nwhere low is an integer for the lower bound" + 
"\nand high is an integer for the upper bound" + 
"\nof the interval for the numbers of the GuessingGame");
}
}
