package programmers.lv1;

public class Solution8 {

    public String solution(String phone_number) {

        int asteriskLength = phone_number.substring(0, phone_number.length() - 4).length();
        String numberPart = phone_number.substring(phone_number.length() - 4);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < asteriskLength; i++) {
            sb.append('*');
        }
        sb.append(numberPart);
        return sb.toString();
    }

}
