public class OnlyThread implements Runnable
{
  private final String Name;
  //can't change the Name
  
  public OnlyThread(String taskName)
  {
    Name = taskName;
    //sets the name
  }
  
  public void run()
  {
    long sum = 0;
    Dice dice = new Dice();
    //new dice object
    sum = dice.roll();
    //dice is being rolled
    System.out.println("The Dice "+Name+" landed on "+sum);
    //shows the name and value
  }
}
