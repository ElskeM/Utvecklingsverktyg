public class GuessingGame {

	public static void main(String[] args) {

		if (args.length == 0 || args.length < 2 || args.length > 2) {
                System.out.println("You must provide two arguments");
                usage();
                System.exit(1);
                }

		
		int min = 0;
		int max = 0;
		try{
		min = Integer.parseInt(args[0]);
                max = Integer.parseInt(args[1]);
                }catch(NumberFormatException nfe){
		System.out.println("The arguments must be numbers");
		usage();
		System.exit(2);
		}

		Guesser guesser = new Guesser(min, max);
                guesser.start();

	}
private static void usage() {
	System.out.println("Usage: java GuessingGame low high" +
	 "\nwhere low is an integer for the lower bound" + 
	"\nand high is an integer for the upper bound" + 
	"\nof the interval for the numbers of the GuessingGame");
	}
}
