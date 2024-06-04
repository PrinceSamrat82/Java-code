import java.util.Arrays;

public class tests {
    public static void main(String[] args) {
        int arr[]={23,54,89,34,90,76,87,34,89,24};
        int min=Arrays.stream(arr).min().getAsInt();
        System.out.println(" Lowest marks is "+ min);
    }
    
}
