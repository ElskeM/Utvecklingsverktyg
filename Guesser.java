
import java.io.Console;
import java.util.Scanner;

public class Guesser {
	private int low;
	private int high;

	public String toString() {
		return "low: " + low + " high: " + high;
	}

	public Guesser(int l, int h) {
		low = l;
		high = h;

		if (high < low) {
			throw new IllegalArgumentException("The first parameter must be lower than the second parameter");
		}
	}

	public void start() {
		rules();
		doGuesses();
	}


  private void rules(){
    System.out.println("Think of a number between " +
                       low + " and "  + high);
    System.out.println("I'm going to ask a few questions in order " +
                       "to guess the number.");
    System.out.println("Please answer T for true, and F for false.\n");
  }

 	private String getReply() {
		String reply = new Scanner(System.in).nextLine();

		if ("T".equalsIgnoreCase(reply) || "F".equalsIgnoreCase(reply)) {
			return reply;
		} else if (!"T".equalsIgnoreCase(reply) || !"F".equalsIgnoreCase(reply)) {
			System.out.println("please answer T or F");
			reply = new Scanner(System.in).nextLine();
		}
		return reply;
	}

  private void doGuesses(){
    int i=0; // number of guesses
    int middle=0;
    while(low<high){
      // Set next guess to the middle between
      // current low and current high
      middle=low + (high-low)/2;

      System.out.println("Is the number less than or equal to " +
                         middle + "?");
      String reply = getReply();
      if("T".equals(reply)){
        // The number is less than or equal to middle
        // so we move down high to middle
        high = middle;
      }else{
        // The number is greater than middle,
        // so we move up low to middle + 1
        low = middle + 1;
      }
      i++; // One more guess!
    }
    // When low has met high, we don't enter the loop
    // and we have found the number
    answer(low, i);
  }

  private void answer(int guess, int numberOfGuesses){
    System.out.println("You were thinking about " +
                       guess +
                       " (took me " + numberOfGuesses +
                       " guesses)");
  }

