public class recursion7 {
    //Print all the subsequeces of a string "abc"?
    // Time complexity is O(2^n), Where n is string length. 
    public static void subsequeces(String str, int index, String newString){

        if (index==str.length()) {
            System.err.println(newString);
            return;
            
        }
        char currChar = str.charAt(index);
        //to be
        subsequeces(str, index+1, newString+currChar);

        //or not to be

        subsequeces(str, index+1, newString);


    }

    public static void main(String[] args) {
        String str= "abc";
        subsequeces(str, 0, "");
    }


    
}
