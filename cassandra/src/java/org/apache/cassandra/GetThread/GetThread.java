public class GetThread{
	public native int HelloWorld();
	static {
		System.loadLibrary("hello");
	}
	
	public int getThreadID()
	{
		int id = HelloWorld();
		return id;
	}

}

