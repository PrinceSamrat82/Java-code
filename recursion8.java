import java.util.HashSet;

public class recursion8 {

//Print all the unique subsequece of a string "aaa"?
// Time complexity is O(2^n), where n is length of strings.

public static void printUniqueSubseq(String str, int index, String res, HashSet<String> allSubseq){

    if (index==str.length()) {

        if (allSubseq.contains(res)) {

            return;
            
        }

        allSubseq.add(res);
        System.out.println(res);
        return;
        
    }
    //choose
    printUniqueSubseq(str, index+1, res+str.charAt(index), allSubseq);

    //don't choose

    printUniqueSubseq(str, index+1, res, allSubseq);



  }


  public static void main(String[] args) {
    
    //String str1 =" abc";
    String str2 = "aaa";
    HashSet<String>allSubseq = new HashSet<>();
    printUniqueSubseq(str2, 0, "", allSubseq);
  }

    
}
