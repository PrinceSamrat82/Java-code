public class recursion9 {
    //Print keypad combination?

    //Time complexity is O(4^n); where n is length of string.

    public static String Keypad[]={".", "abc", "def",  "ghi", "jkl", "mno", " pqrs", "tu", "vwx", "yz"};

    public static void printKeypadCombination(String number, int index, String res){

        if (index== number.length()) {
            System.out.println(res);
            return;
            
        }
        for(int i=0; i< Keypad [number.charAt(index)-'0'].length(); i++){ 
         char curr = Keypad[number.charAt(index)-'0'].charAt(i);
            printKeypadCombination(number, index+1, res+curr);

        }


    }
     public static void main(String args[]) {


        String number ="23";
        printKeypadCombination(number, 0, "");
        
     }


    
}
