public class test6 {
    static int Mango[]={4,10,7,3,6,9,5,30,20};
    static int maximum(){
        int i;
        int maximum=Mango[0];
        for(i=1;i<Mango.length;i++){
            if(Mango[i]>maximum){
                maximum=Mango[i];
            }
        }

        return maximum;
    }
    public static void main(String[] args) {
        System.out.println(" Maximum number of mangoes is " + maximum());
    }
}
