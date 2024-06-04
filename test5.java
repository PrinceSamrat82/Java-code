public class test5 {
    static int marks[]={93,45,76,85,92,56,90,34};
    static int Smallest(){
        int i;
        int min=marks[0];
        for(i=1;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Lowest Marks is " +Smallest() );
    }
    
}
