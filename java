import java.util.HashMap;

class Solution{
    public static int longestSubstringLength(String password){
        // 関数を完成させてください
        int differentLength = 1;

        for(int i = 0; i < password.length(); i++){
            int currentLength = differentLengthFromStart(password, i);

            if(currentLength > differentLength) differentLength = currentLength;
        }

        return differentLength;
    }

    // [start] からの重複なし文字列の長さ
    public static int differentLengthFromStart(String password, int start){
        HashMap<Character, Integer> listOfChar = new HashMap<>();

        for(int i = start; i < password.length(); i++){
            char currentChar = password.charAt(i);
            if(listOfChar.get(currentChar) == null) listOfChar.put(currentChar, 1);
            else break;
        }

        int count = 0;
        for(Character key : listOfChar.keySet()) count++;
        return count;
    }
}
