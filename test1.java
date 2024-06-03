class test1 {
    static int array[]={22,5,7,1,89,24,56,87,8,45,23,345,234,9290};
    static int largest(){
        int i;
        int maximum=array[0];
        for(i=1;i<array.length;i++){
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println("Largest Number is "+largest());
    }
    
}
