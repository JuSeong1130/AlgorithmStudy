import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {


        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % divisor == 0)
            {
                list.add(arr[i]);
            }
        }
        int n = list.size();
        Collections.sort(list);
        if(n == 0)
        {
            int[] a = {-1};
            return a;

        }
        int[] answer = new int[n];
        for(int i=0; i< answer.length; i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}