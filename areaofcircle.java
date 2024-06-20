import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final float PI=3.14f;
        float radius=sc.nextFloat();
        float area=PI* radius*radius;
        System.out.println("Area of circle is " + area);
    }
}
