import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main
{
  public static void main(String[] args)
  {
    DiceRoller[] Roller = new DiceRoller[25];
    //makes 25 dicerolllers
    
    for( int i = 0; i<Roller.length;i++)
    {
      Roller[i] = new DiceRoller("Task"+i);
      //creates a task with an array
    }
    
    System.out.println("Begininng Executor ");
    ExecutorService TE = Executors.newCachedThreadPool();
    
    for(int i= 0; i<Roller.length; i++)
    {
      TE.execute(Roller[i]);
      //executes with an array
    }
    
    TE.shutdown();
    //closes the executor
    
    System.out.println("Task has begun. The main has ended.");
  }
}
