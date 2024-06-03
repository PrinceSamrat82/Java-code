// Java Program to find maximum in arr[]
class test {
    static int[]arr= {20,12,56,9,40,2,7};
    static int largest(){
        int i;
        int max=arr[0];
        for(i=1; i<arr.length;i++)
            if(arr[i]>max){
                max=arr[i];
            }

        return max;

    }

    public static void main(String[] args) {
        System.out.println("Largest element is "+ largest());
    }

}
