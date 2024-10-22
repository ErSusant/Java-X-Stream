public class LongestSubString {

    public static void main(String[] args) {
        String str="abcdabcdef";

            String longestSubstring="";             // To store the Longest Substring found
            for(int i=0;i<str.length();i++){        // Outer loops picks the starting point of the substring
                String temp="";                     // Temporary string to store the current substring

            for(int j=i;j<str.length();j++){        // Inner loop picks the ending point of the substring
                char currentChar = str.charAt(j);

                if(temp.indexOf(currentChar)!=-1){   // If the Character is already in the temporary string break out
                    break;
                }
                temp+=currentChar;                   // Add the Current character to the temporary substring

                if(temp.length()>longestSubstring.length()){    // If the temporary substring is longer than
                                                                //the current longest substring ,update it
                    longestSubstring=temp;
                }
            }
        }
        System.out.println("Longest Substring Without Repeating: "+longestSubstring);
    }
}
