import java.util.*;
class Solution {


    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        Queue<Integer> queue=new LinkedList<Integer>();
        List<Integer> list =new ArrayList<Integer>();
        int day=0;

        for(int i=0;i<progresses.length;i++){

            int p= progresses[i];

            while(p<100){
                p+=speeds[i];
                day++;
            }
            queue.add(day);
            day=0;
        }
        int cnt=1;
        int prev = queue.poll();;
        while (!queue.isEmpty()){
            if(prev>= queue.peek()){
                cnt++;
                queue.poll();
                if(queue.isEmpty()){
                    list.add(cnt);
                }
            }else{
                list.add(cnt);
                cnt=1;
                prev=queue.poll();
                if(queue.isEmpty()){
                    list.add(cnt);
                }
            }

        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;


    }
}
import java.util.*;
class Solution {


    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        Queue<Integer> queue=new LinkedList<Integer>();
        List<Integer> list =new ArrayList<Integer>();
        int day=0;
        for(int i=0;i<speeds.length;i++)
        {
            int p=progresses[i];
            while(p<=100)
            {
                if(p>=100) break; //1번문제 해결 100인데 들어옴
                p+=speeds[i];
                day++;
            }
            queue.add(day);
            day=0;
        }

        //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

        while(!queue.isEmpty())
        {
            int cnt=1;
            int prev=queue.poll();
            while(!queue.isEmpty() && queue.peek() <=prev)
            {
                cnt++;
                queue.poll();
            }
            list.add(cnt);

        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;

    }
}