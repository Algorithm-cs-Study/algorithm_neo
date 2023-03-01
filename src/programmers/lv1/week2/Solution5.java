package programmers.lv1.week2;

public class Solution5 {

    public int solution(int n) {
        String converted = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        System.out.println(converted);
        for (int i = converted.length() - 1; i >= 0; i--) {
//            if (converted.charAt(i) != '0') {
//                sb.append(converted.charAt(i));
//            }
            sb.append(converted.charAt(i));
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
