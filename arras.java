public class arras {

    static int largest(int arr[], int n ){

        for( int i=1;i<n;++i){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key ){
                arr[j+1]=key;
                j=j-1;
            }
            arr[j+1]=key;

        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        int marks[]={45,35,87,45,46,98,90,3445};
        int n=marks.length;
        System.out.println(largest(marks ,n));
    }
    
}
