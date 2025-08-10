package myPackage;

public class MyCounter {
	public int a=0;
	
	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public static void main(String[] args)
	{
		MyCounter c=new MyCounter();
		c.increment();
		c.increment();
	}

}
