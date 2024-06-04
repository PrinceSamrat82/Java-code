import java.util.Arrays;

public class test8 {
    public static void main(String[] args) {
        int arr[]={20,45,64,23,7,4,9,80};
        int min=Arrays.stream(arr).min().getAsInt();

        System.out.println("Smallest Number is " + min);
    }
    
}
