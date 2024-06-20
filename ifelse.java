import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your age :-");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("You are eligible for vote in election 2025.");
        }else{
            System.out.println("You are not eligible for vote in election 2025.");
        }
    }
    
}
