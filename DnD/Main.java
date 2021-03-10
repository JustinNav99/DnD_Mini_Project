public class Main
{
   public static void main(String[] args) {
      try
      {
         new int[]{1, 2, 3};
         int sum = 0;
         
         for (int i = 1; i < 4; i++)
         {
            sum += arr[i];
         }
         System.out.println("Sum: " + sum);
      }
      catch (Exception e)
      {
         System.out.println("Exception was caught!");
      }
      catch (IndexOutOfBoundsException e)
      {
         System.out.println("IndexOut");
      }
   }
}