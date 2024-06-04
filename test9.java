import java.util.Arrays;

public class test9 {
    public static void main(String[] args) {
        int marks[]={34,56,89,98,68,38,19,30};
        int max=Arrays.stream(marks).max().getAsInt();
        System.out.println(" Maximum marks is " + max);
    }
    
}
