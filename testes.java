public class testes {
    static int arr[]={45,35,5233,89,252,523,88,98};
    static int largest(){
        int i;
        int max=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest number is " + largest());
    }
}
