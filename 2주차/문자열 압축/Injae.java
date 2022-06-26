class Solution {
    public int solution(String s) {
        int answer = s.length();
        StringBuilder sb = new StringBuilder();
        for(int size = 1; size <= s.length() / 2; size++) {
            String compareString = s.substring(0, size);
            String nextString = "";
            int count = 1;
            for(int i = size; i < s.length(); i+=size) {
                if(s.length() > i + size)
                    nextString = s.substring(i, i + size);
                else
                    nextString = s.substring(i);

                if(compareString.equals(nextString))
                    count += 1;
                else {
                    if(count > 1)
                        sb.append(count);
                    sb.append(compareString);
                    count = 1;
                    compareString = nextString;
                }
            }
            if(count > 1)
                sb.append(count);
            sb.append(compareString);
            if(sb.length() < answer)
                answer = sb.length();
            sb.delete(0, sb.length());
        }
        return answer;
    }
}