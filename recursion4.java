public class recursion4 {

    //check if an array is sorted (strictly increasing)?
    //Time complexcity =O(n).

    public static boolean isSorted(int arr[], int index){

        if (index==arr.length-1) {
            return true;
          
        }
        if (arr[index]<arr[index+1]) {
            return isSorted(arr, index+1);
            
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,6,5};
        System.out.println(isSorted(arr, 0));
    }
    
}
