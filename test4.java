 //Find minimum number
 class test4 {
    static int number[]={23,45,67,34,5,68,90,1,9,};
    static int smallest(){
        int i;
        int minimum=number[0];
        for(i=1;i<number.length;i++){
            if(number[i]<=minimum){
                minimum=number[i];
            }
        }
      return minimum;
    }
    public static void main(String[] args) {
        System.out.println("Smallest number is "+smallest()+" these number");
    }
}
