package programmers.lv1.week2;

import java.util.Locale;

public class Solution6 {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            sb.append(convertWord(words[i]));
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String convertWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                sb.append(String.valueOf(word.charAt(i)).toUpperCase(Locale.ROOT));
            } else {
                sb.append(String.valueOf(word.charAt(i)).toLowerCase(Locale.ROOT));
            }
        }
        return sb.toString();
    }

}
