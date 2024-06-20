import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:-");
        float a=sc.nextFloat();
        System.out.println("Enter second number :-");
        float b=sc.nextFloat();
        
        System.out.println(a+b);
        System.out.println(a-b );
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
    
}
