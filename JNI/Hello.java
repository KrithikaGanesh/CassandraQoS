public class Hello {

	public static void main(String args[])
	{
		GetThread object = new GetThread();
		int id = object.getThreadID();
		System.out.println("id is " + id);
		while (true);
	}
}

