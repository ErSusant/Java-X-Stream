import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        //First, Check if the lengths of the two Strings are the same
        if(str1.length()!=str2.length()){
            System.out.println("The Strings are not Anagrams ");
            return;
        }

        //Convert Both String to character Array
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str1.toCharArray();

        //Sort the Character Array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //Compare Sorted Character Array
        if(Arrays.equals(charArray1,charArray2)){
            System.out.println("The Strings are Anagram");
        }else{
            System.out.println("The strings are not anagrams");
        }
    }
}
