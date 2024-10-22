public class Main {
    public static void main(String[] args) {
         String input="madam";
    String reversed="";
         for(int i=input.length()-1;i>=0;i--){
              reversed+=input.charAt(i);
         }
         boolean equals=input.equals(reversed);
         if(equals){
             System.out.println(input+" is palindrome");
         }else{
             System.out.println(input+" is Not Palindrome");
         }
    }
}