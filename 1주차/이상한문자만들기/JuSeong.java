package programeers.level1;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution("  try   hello world  "));
    }
    public static String solution(String s) {

        /*
          문제 해결방법
        *  기본값으로 두고 split " " 을 하게되면
        *  앞에는 " "가 있는만큼 ""가 들어가게되고 중간은 -1개가 들어가게됨 마지막은 들어가지않음
        *  이를 유의하며 문제를 풀면 해결됨
        * */

        String[] sp = s.split(" ");

        String answer = "";
        for(int i = 0 ; i < sp.length; i++)
        {
            for(int j=0; j < sp[i].length(); j++)
            {
                if(j % 2 == 0)
                {
                    answer += Character.toUpperCase(sp[i].charAt(j));
                }
                else
                {
                    answer += Character.toLowerCase(sp[i].charAt(j));
                }
            }
            if(i != sp.length-1)
            {
                answer += " ";
            }

        }
        if(s.length() > answer.length())
        {
            answer+= s.substring(answer.length());
        }


        return answer;
    }
}
