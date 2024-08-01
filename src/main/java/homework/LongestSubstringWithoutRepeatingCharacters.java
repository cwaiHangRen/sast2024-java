package homework;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        // TODO begin
        int left = 0, right = 0;
        for(int i=0;i<n;++i){
            int j=left;
            for(;j<right;++j){
                if(s.charAt(i)==s.charAt(j)) {
                    break;
                }
            }
            if(j==right) {
                right = i+1;
                if(right-left>ans) {
                    ans = right-left;
                }
                continue;
            }
            left = j+1;
            right = i+1;
            if(right-left>ans) {
                ans = right-left;
            }
        }
        
        // TODO end
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
}
