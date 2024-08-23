import java.util.Scanner;
public class IT24102678Lab5Q1

{
 public static void main(String[] args)
 {
  Scanner scanner =new Scanner(System.in);
  
  System.out.print("Enter the first integer");
  int first=scanner.nextInt();

  System.out.print("Enter the second integer");
  int second =scanner.nextInt();

  System.out.print("Enter the third integer");
  int third=scanner.nextInt();


 int smallest=Math.min(first,Math.min(second,third));

 int m=Math.max(second,third);
 int largest=Math.max(first,m);

 System.out.println("\nuser entered number are : "+first+" "+second+" "+third);
 System.out.println("The smallest number is : " +smallest);
 System.out.println("The largest number is: "+largest);
 

 }
}