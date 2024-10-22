public class CheckPalindrome {
    public static void main(String[] args) {
         String input="madam";
         String reversed="";

         //Reversing Using For loop
         for(int i=input.length()-1;i>=0;i--){
              reversed+=input.charAt(i);
         }

         //Checking Palindrome
         boolean palindrome=input.equals(reversed);
         if(palindrome){
             System.out.println(input+" is palindrome");
         }else{
             System.out.println(input+" is Not Palindrome");
         }
    }
}