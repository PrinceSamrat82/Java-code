import java.util.*;
public class starpetterns {
    public static void main(String args[]){
        int m=5;
        int n=4;
        //outer loop
        for(int i=1;i<=n; i++){
            //inner loop
            for( int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    
}
