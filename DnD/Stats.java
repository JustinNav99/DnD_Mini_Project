public class Stats {
   private int[][] stats = new int[6][2];
   
   public Stats() {
      DiceRoller die;
      for(int i = 0; i < 6; i++) {
         int tot = 0;
         int curr = 6;
         int finalNum = 0;
         int[] currRolls = new int[4];
         
         for(int j = 0; j < 4; j++) {
            die = new DiceRoller(6);
            int num = die.getNum();
            currRolls[j] = num;
         }
         
         for(int k = 0; k < 4; k++) {
            int number = currRolls[k];
            
            if(number < curr) {
               curr = number;
            }
            
            tot += number;
         }
         
         finalNum = tot - curr;
         stats[i][0] = finalNum;
         
         if(finalNum == 3) {
            stats[i][1] = -4;
         } else if(finalNum == 4 || finalNum == 5) {
            stats[i][1] = -3;
         } else if(finalNum == 6 || finalNum == 7) {
            stats[i][1] = -2;
         } else if(finalNum == 8 || finalNum == 9) {
            stats[i][1] = -1;
         } else if(finalNum == 10 || finalNum == 11) {
            stats[i][1] = 0;
         } else if(finalNum == 12 || finalNum == 13) {
            stats[i][1] = 1;
         } else if(finalNum == 14 || finalNum == 15) {
            stats[i][1] = 2;
         } else if(finalNum == 16 || finalNum == 17) {
            stats[i][1] = 3;
         } else if(finalNum == 18) {
            stats[i][1] = 4;
         }
      }
   }
   
   public int[][] getStats() {
      return stats;
   }
}  