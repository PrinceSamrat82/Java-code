import java.util.*;
public class primeno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        boolean isPrime=true;
            System.out.print("Enter your number:-");
            int number=sc.nextInt();
            for(int i=2;i<=number/2;i++){
                if( number%i==0){
                 isPrime=false;
                 break;
                    }

                }
                if(isPrime){
                  if( number==1){
                    System.out.println("This is nither prime number not composite number.");
                    }
                    else{
                     System.out.println("This is prime number.");
                    }
                 }
                else{
                    System.out.println("This is not prime number.");
                }
            }
            
            

    }
    

