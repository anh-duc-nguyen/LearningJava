package myThread;

public class MyThread extends Thread{
	private int startIndex,maxIndex;
	private static long numberOfThread;
	public MyThread(int s, int n, int m)
	{
		this.startIndex = s;
		this.numberOfThread = n;
		this.maxIndex = m;
	}
	@Override
	public void run()
	{
		for(int i = this.startIndex; i < this.maxIndex; i += this.numberOfThread)
		{
			System.out.println("[ID " + this.getId() + "] " + i);
		}
	}
}

