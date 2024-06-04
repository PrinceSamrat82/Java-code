public class testarr {
    static int largest( int arr[], int n){
        for(int i=1; i<n; ++i){
            int key= arr[i];
            int j= i-1;
        

            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
                
            }
            arr[j+1]=key;
        }
        return arr[n-1];  
    }

    static public void main(String[] args){
        int arr[]={34,56,24,34,98,100,456,234,56,335,893,2};
        int n=arr.length;
        System.out.println(largest(arr, n));
    }
    
}
