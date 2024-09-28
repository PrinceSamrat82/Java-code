public class Recursionnext {
    public static void towerofHonoi(int n, String src, String helper, String dest  ){
        if (n==1) {
            System.out.println(" Transfer disck "+ n + " from " + src + " to " + dest);
        return;
            
        }
        

    towerofHonoi(n-1, src, dest, helper);
    System.out.println(" Transfer disck "+ n + " from " + src + " to " + dest);
    towerofHonoi(n-1, helper,src, dest);
    }

    
    public static void main(String[] args) {
        int n=3;
        towerofHonoi(n, " S ", " H ", " D ");
        
    }
    
}
