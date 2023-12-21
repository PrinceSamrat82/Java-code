import java.util.Scanner;

public class Average {
   public static float AverageNumber(float number1,float number2, float number3) {
    
                float aver = (number1+number2+number3)/3;   
                return aver ;
    }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter 3 number for average :-");
    float number1= sc.nextInt();
    float number2=sc.nextInt();
    float number3=sc.nextInt();


    float averag =AverageNumber(number1, number2, number3);
    System.out.println("Average of 3 number is " +averag);


}

}
