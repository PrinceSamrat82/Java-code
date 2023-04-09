import java.util.*;
public class calculator {
    public static void main(String args[]){
        System.out.println("->1.Addition  ->2.Subtraction  ");
        System.out.println("->3.Multiplication  ->4.Division ");
        System.out.println("->5.Modilo or Remainder\n");
        System.out.print("Enter Number:-");

        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
    
        double b=sc.nextDouble();
        
        double add=a+b;
        double sub=a-b;
        double multi=a*b;
        double div=a/b;
        double remo=a%b;
        System.out.print("Select the option:-");
        int i=sc.nextInt();
        switch (i) {
            case 1:
            System.out.print("Addition Result=");
            System.out.println(add);
            break;
            case 2:
            System.out.print("Subtraction Result=");
            System.out.println(sub);
            break;
            case 3:
            System.out.print("Multiplication Result=");
            System.out.println(multi);
            break;
            case 4:
             if(b==0){
                    System.out.print("Division Result=");
                    System.out.print("Invalid Division");
             }
             else{
                System.out.println(div);
             }
            break;
            case 5:
             if(b==0){
                System.out.print("Remainder Result=");
                System.out.println("Invalid Division");
                }
             else{
                System.out.println(remo);
                }
             break;

            default:
            System.out.println("Invalid choice");
                break;
        }
        
    }
    
}
