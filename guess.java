// Read a character from the keyboard
class guess
{
	public static void main(String args[])
	throws java.io.IOException {
		System.out.println("Pick a letter from A - Z. Guess correctly to win.");
		char ch, answer = 'g';
		System.out.print("\nYour answer? ");
		ch = (char) System.in.read(); // get a char
		if(ch == answer)
		{
			System.out.print("Congratulations! You guessed correct. ^_^");
		}
		else
		{
			System.out.print("Your guess was ");
			if(ch > answer) //too high
			{
				System.out.print("too high.");
			}
			else //too low
			{
				System.out.print("too low.");
			}
			System.out.print("\nTry again.");
		}
	}
}