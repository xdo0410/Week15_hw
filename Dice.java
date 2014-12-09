import java.util.*;

public class Dice {
    static Random random = new Random();
    public Dice(){

 }

public static int roll(){
  return random.nextInt(6)+1;
 }
}
