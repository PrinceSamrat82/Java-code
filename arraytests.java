import java.util.Arrays;

public class arraytests {
    public static void main(String[] args) {
        int arr[]={65,45,898,355,87,25455,87697};
        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println(" largest number is " + max);
        int array[]={554,89,45,898,4564,78,90,768,34,1};
        int min=Arrays.stream(array).min().getAsInt();
        System.out.println("minimum number is " + min);
    }

  
    
}
