// Read a character from the keyboard
class kbIn
{
	public static void main(String args[])
	throws java.io.IOException {
		System.out.println("Java is new to me.");
		
		char ch;
		System.out.print("Press a key followed by ENTER: ");
		ch = (char) System.in.read(); // get a char
		System.out.print("You entered '" + ch + "' ");
	}
}