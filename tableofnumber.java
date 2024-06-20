import java.util.Scanner;
public class tableofnumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=10;
        int number=sc.nextInt();
        System.out.println("Table of "+ number+ " is " );
        for(int i=1;i<=n;i++){
            int table=number*i;
            System.out.println(table);
        }
        
    }
    
}
