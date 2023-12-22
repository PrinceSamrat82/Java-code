import java.util.Scanner;
//Square formula program

public class x_nmult {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter X number :");
        int x =sc.nextInt();
        System.out.println("Enter n number : ");
        int n=sc.nextInt();
         int result=1;
        for( int i=0;i<n;i++){
            result=result*x;
        }
        System.out.println("X to the power n is " +result);
    }
    
}
