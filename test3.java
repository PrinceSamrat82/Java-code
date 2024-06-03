class test3 {
    static int []number={23,45,1,6,3,98,90,45,23445,876,1234,89765,123456,0,3};
    static int largest(){
        int i;
        int max=number[0];
        for(i=1;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Largest number is "+largest()+" these number!");
    }
}
