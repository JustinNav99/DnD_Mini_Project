import java.util.Random;

public class DiceRoller {
   private int dieNum;
   
   public DiceRoller(int num) {
      Random rand = new Random();
      
      this.dieNum = rand.nextInt(num) + 1;
   }
   
   public int getNum() {
      return this.dieNum;
   }
}