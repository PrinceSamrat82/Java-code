import java.util.Scanner;

public class greaternumber {
    public static void greater(int a, int b) {
        if(a>b){
            System.out.println(a);

        }else{
            System.out.println(b);
        }
        
        
    }
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two Number :-");
        int a=sc.nextInt();
        int b=sc.nextInt();

        greater(a, b);
     }
    
}
