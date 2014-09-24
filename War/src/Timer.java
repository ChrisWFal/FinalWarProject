import java.util.concurrent.TimeUnit;


public class Timer
	{
	public static void timer()
		{
		try
			{
			TimeUnit.SECONDS.sleep(1);
			}
		catch(InterruptedException e)
			{
			// Handel exception
			}
		}
	}
