import java.util.Scanner;
public class Electricity
{
     public static void main(String[] args)
     {
          Scanner s=new Scanner(System.in);
          int b1=s.nextInt();
          int limit=250;
          int cost=50;
          if(limit > b1 || limit == b1)
          {
               System.out.println("Electricity bill is 0 ");
          }
          else
          {
              System.out.println("Electricity bill is : "+ (b1-limit));
           }
      
      }
}