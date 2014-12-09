import java.util.Random;

public class Dice
{
  Random random = new Random();
  
  public Dice()
  {
  
  }
  
  public int roll()
  {
    return random.nextInt(6)+1;
    //has the dice roll from 1-6
  }
}
