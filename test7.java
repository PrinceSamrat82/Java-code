import java.util.Arrays;
public class test7 {
    public static void main(String[] args) {
        int arr[]={23,54,67,24,18,68,98,100,16};
        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest element is " + max );
    }
    
}
