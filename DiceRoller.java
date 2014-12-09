public class DiceRoller implements Runnable
{
  private final String taskName;
  //name can't be changed
  public DiceRoller(String name)
  {
    taskName = name;
    //sets the taskName
  }
  
  public void run()
  {
    //use of try, catch
    try
    {
      System.out.printf("%s Start \n",taskName);
      Runnable T1 = new OnlyThread(taskName);
      Thread worker = new Thread(T1);
      worker.setName(taskName);
      worker.start();
    }
    catch(Exception e)
    {
      System.out.printf("%s %s ",taskName, "terminated prematurely because of an interruption.");
    }
    
    System.out.printf("%s Finished Throwing.",taskName);
    //when the try catch is finished
  }
}
