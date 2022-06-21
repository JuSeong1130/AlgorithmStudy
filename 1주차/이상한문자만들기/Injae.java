class Solution {
    public String solution(String s) {
        StringBuilder ret = new StringBuilder();
        for (String str : s.split(" ", -1)) {
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 != 0) {
                    ret.append(Character.toLowerCase(str.charAt(i)));
                } else {
                    ret.append(Character.toUpperCase(str.charAt(i)));
                }
            }
            ret.append(" ");
        }
        return ret.substring(0, ret.length() - 1);
    }
}