import java.util.Scanner;

public class circle_circumference {

    public static int circle(int r) {
        int c=2*22/7*r;
        return c;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
         float D=circle(r);
         System.out.println(D);
    }
    
}
