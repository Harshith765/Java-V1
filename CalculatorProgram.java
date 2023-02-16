import java.util.Scanner;

public class Main(){
  public static void main (String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the first number");
    int firstnum = userInput.nextInt();
    System.out.println("Enter the second number");
    int secondnum = userInput.nextInt();
    System.out.println("Choose the following options for the desired result");
    System.out.println(" 1) Add");
    System.out.println(" 2) Subtract");
    System.out.println(" 3) Multiply");
    System.out.println(" 4) Divide");
    int option;
    int result;
    if (option == 1)
    {
      result = firstnum + secondnum;
      System.out.println("The result is "+result);
    }
    else if (option == 2)
    {
      result = firstnum - secondnum;
      System.out.println("The result is "+result);
    }
    else if (option == 3)
    {
      result = firstnum*secondnum;
      System.out.println("The result is "+result);
    }
    else if (option == 4)
    {
      result = firstnum/secondnum;
      System.out.println("The result is "+result);
    }
    else
    {
      System.out.println("Incorrect option");
    }
  }
}
