import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, ArrayList<String>> reportUserMap = new LinkedHashMap<>();
        Map<String, Integer> reportCountMap = new LinkedHashMap<>();
        report = Arrays.stream(report).distinct().toArray(String[]::new);
        
        for(String s : id_list) {
            reportUserMap.put(s, new ArrayList<>());
            reportCountMap.put(s, 0);
        }
        
        for(String s : report) {
            String[] tempStringArr = s.split(" ");
            String key = tempStringArr[1];
            String value = tempStringArr[0];
            reportUserMap.get(key).add(value);
        }
        
        for(String s : id_list) {
            if(reportUserMap.get(s).size() >= k) {
                reportUserMap.get(s)
                    .forEach(K -> reportCountMap.put(K, reportCountMap.getOrDefault(K, 0) + 1));
            }
        }
        
        return Arrays.stream(reportCountMap.values().toArray(new Integer[0]))
            .mapToInt(i -> i)
            .toArray();
    }
}