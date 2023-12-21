import java.util.Scanner;

public class agefunction {
    public static void age_for_vote(int n){
        if(n>18){
            System.out.println("You are eligible for vote.");
        }else{
            System.out.println("You are not eligible for vote!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :-");

        int n=sc.nextInt();
        age_for_vote(n);
    }
    
}
