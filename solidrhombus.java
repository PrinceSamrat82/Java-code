import java.util.*;
public class solidrhombus {
    public static void main(String args[]){
        int n=5;
        int m=9;
    
         for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j<=m-4-i || j>=m+2-i){
                System.out.print("  ");
              }else{
                System.out.print("  *  ");
              }
            }
            System.out.println();
         }
    }
    
}
