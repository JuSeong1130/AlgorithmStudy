import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,List<String>> userMap = new HashMap<>();
        Map<String,Integer> reportNumMap = new HashMap<>();

        for(int i=0;i<report.length;i++){
            String[] str= report[i].split(" ");
            String userId=str[0];
            String reportId=str[1];
            if(userMap.containsKey(userId)){//신고한 유저가 포함되어있다면
                List<String> list =userMap.get(userId);
                if(!list.contains(reportId)){//신고당한 유저가 포함되어있지 않다면
                    list.add(reportId);
                    userMap.put(userId,list);
                    if(reportNumMap.containsKey(reportId)){
                        reportNumMap.put(reportId,reportNumMap.get(reportId)+1);
                    }else{
                        reportNumMap.put(reportId,1);
                    }
                }
            }else{//신고한 유저가 포함되어있지 않다면
                List<String> list= new ArrayList<>();
                list.add(reportId);
                userMap.put(userId,list);
                if(reportNumMap.containsKey(reportId)){
                    reportNumMap.put(reportId,reportNumMap.get(reportId)+1);
                }else{
                    reportNumMap.put(reportId,1);
                }
            }
        }

        for(int i =0;i<id_list.length;i++){
            if(userMap.containsKey(id_list[i])){//신고한 유저가 있다면
                List<String> list= userMap.get(id_list[i]);
                //System.out.println(id_list[i]+" : "+list.size());
                int res=0;
                for(String s : list){
                    //System.out.println(id_list[i]+" : "+s);

                    if(reportNumMap.get(s) >=k){
                        res++;
                    }
                }
                answer[i]=res;
            }else{
                answer[i]=0;
            }
        }
        return answer;
    }
}