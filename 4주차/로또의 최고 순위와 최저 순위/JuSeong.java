import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        List<Integer> lottos_list = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> win_nums_list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int count = (int)Arrays.stream(lottos).filter(zero -> zero==0).count();
        int cnt=0;
        for(int i=count;i<lottos.length;i++){
            if(win_nums_list.indexOf(lottos_list.get(i)) !=-1){
                cnt++;
            }
        }
        int rank2=0;
        switch(cnt)
        {
            case 6: rank2=1;break;
            case 5: rank2=2;break;
            case 4: rank2=3;break;
            case 3: rank2=4;break;
            case 2: rank2=5;break;
            default: rank2=6;break;
        }
        int rank=0;
        switch(cnt+count)
        {
            case 6: rank=1;break;
            case 5: rank=2;break;
            case 4: rank=3;break;
            case 3: rank=4;break;
            case 2: rank=5;break;
            default: rank=6;break;
        }

        return new int[]{rank,rank2};
    }
}