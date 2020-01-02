package multithread;


class MusicPlayer extends Thread
	{
		public void run()
		{
			
				System.out.println("Music is playing");
			
		}
	}
	class MsWord implements Runnable
	{
		public void run()
		{
		
				System.out.println("Typing Ms word document");
			
		}
	}
public class Main
{
	public static void main(String[] args)
	{
		MusicPlayer music=new MusicPlayer();
		Runnable obj=new MsWord();
		//MsWord thread2=new MsWord();
		Thread th=new Thread(obj);
		music.start();
		th.start();

	}

}
