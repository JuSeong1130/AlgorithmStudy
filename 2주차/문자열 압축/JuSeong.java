package programeers.level2;

public class 문자열압축 {
    public static void main(String[] args) {

        System.out.println(solution("aaaabbbb"));
    }
    /*
     *
     *  배운점 substring의 beginindex는 length가 넘는값이 와도되고 endIndex는 length까지만 와야함
     *
     * */
    public static int solution(String s) {
        int answer=s.length();
        for(int cut=1;cut<=s.length()/2;cut++){
            String res="";
            String prev=s.substring(0,cut);
            String str=prev;
            int cnt=1;
            for(int i=cut;i<=s.length();i+=cut){
                //<=로하는이유  aaaa로 4a를 하고 bbbb로 cnt를 4로만들지만 7이 되버리므로 끝나게됨
                //<=를 통해 now에 ""를 넣게하여 cnt가 들어간 값은 넣게해줌
                String now=i+cut>s.length() ?  "" : s.substring(i,i+cut);
                str+=now;
                if(prev.equals(now)){
                    cnt++;
                }else{
                    if(cnt!=1){
                        res+=cnt;
                    }
                    res+=prev;
                    cnt=1;
                    prev=now;
                }
            }
            //혹시모를 남아있는 값들이 안들어가있을수 있기때문에 넣어줌
            //ex) aaaabbbb를 3으로한다면 aaaaabb까지만들어가게됨 왜냐하면 length가 8인데 3+3+3이되게되서 9가나오게되므로 못들어가는게있음
            if(str.length()<s.length()){
                res+=s.substring(str.length(),s.length());
            }
            System.out.println(res);
            answer=Math.min(answer,res.length());
        }
        return answer;
    }
    //https://jithub.tistory.com/3
    public static String padRight(String s, int n) {
        int len= s.length()+n;
        return String.format("%-"+len+"s", s,n);
    }
}

