class test2 {
    static int []marks={89,45,67,89,26,90,99,56,34,23,98,87};
    static int largest(){
        int i;
        int maximum=marks[0];
        for(i=1;i<marks.length;i++){
            if(marks[i]>maximum){
                maximum =marks[i];


            }
           
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println("Maximum marks is "+largest());
    }
}
