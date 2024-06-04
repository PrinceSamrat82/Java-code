public class prince {
    static int largest(int arr[], int n){
        for(int i=1;i<n;++i){
            int key= arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        int marks[]={34,56,25,63,45,25,62,78};
        int n=marks.length;
        System.out.println(largest(marks, n));
    }
    
}
