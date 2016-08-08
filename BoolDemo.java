class BoolDemo
{
	public static void main(String args[])
	{
		boolean alpha = false;
		
		//only one of these if statements should print if it is working correctly
		if(alpha)
		{
			System.out.println("Alpha is " + alpha);
		}
		if(!alpha)
		{
			System.out.println("Alpha is " + alpha);
		}
		System.out.println("Completed!");
	}
}