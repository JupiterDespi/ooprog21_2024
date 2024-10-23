import java.util.Scanner;
public class SortThreeNumbers {
   public static void main(String [] a){
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.print("Input first number: ");
      int num1 = scanner.nextInt();
      System.out.print("Input second number: ");
      int num2 = scanner.nextInt();
      System.out.print("Input third number: ");
      int num3 = scanner.nextInt();
      
      if (num1 >= num2 && num2 >= num3){
         System.out.print("descending order: "+ num1 + "," + num2 + "," + num3 );
      }else{
            
            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));
            int mid = num1 + num2 + num3 - max - min;
      
         System.out.println("The numbers in ascending number: " + min+ ", " + mid + ", " + max);
  
      }
     
      }
}
