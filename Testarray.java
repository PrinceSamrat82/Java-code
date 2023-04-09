 class Testarray {
    public static void main(String args[]){
        int a[]= {23,56,76,34,98,75,45,20};     //initialization
        //traverse array
        for( int i=0;i<a.length;i++){    //length is the property
            System.out.print(a[i]+" ");
        }
        System.out.println();

        float sum=0,avg;
        for(int i=0;i<a.length;i++)     //Calculating the sum of the averge.
        sum += a[i];
        avg=sum/a.length;
        System.out.println("Averge ="+ avg);
    }

}
