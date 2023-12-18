import java.util.Scanner;

public class Functions1 {
  public static void printMyFathersName(String name){
    System.out.println(name);
    return;

  } 
  
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your Father's Name:-");
    String name = sc.next();

    printMyFathersName(name);//call kiye function
  }
}
