
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main{

	public static void main(String[] args) {
		SimpleArray sharedSimpleArray = new SimpleArray(9);
		Roll[] Roller = new Roll[3];
		for(int i = 0; i<Roller.length;i++)
		{
		
			Roller[i]= new Roll(Dice.roll() ,sharedSimpleArray);	
		}

		System.out.println("Starting executor");
		ExecutorService executor = Executors.newCachedThreadPool();
		

		for(int i = 0;i<Roller.length;i++){
			
			executor.execute (Roller[i]);
		}	
		executor.shutdown();
		System.out.println("Task");
		try
		 {
			boolean tasksEnded = executor.awaitTermination(1, TimeUnit.MINUTES );
			if ( tasksEnded )
				System.out.println( sharedSimpleArray ); 
			else
				System.out.println("Timed out while waiting for tasks to finish." );
			} 
		catch ( InterruptedException ex )
		 {
		 System.out.println( "Interrupted while wait for tasks to finish." ); 
	}
	}
}
