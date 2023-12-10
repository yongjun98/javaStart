package ProegrammersLV1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ex80 {
    public static void main(String[] args) {
        String [] id_list = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    private static int[] solution(String[] id_list, String[] report, int k) {
        int[]answer = new int[id_list.length];
        HashMap<String,Integer> idMap = new HashMap<>();
        HashMap<String, HashSet<String >>map = new HashMap<>();

        for(int i=0; i<id_list.length; i++){
            idMap.put(id_list[i],i);
            map.put(id_list[i],new HashSet<>());
        }

        for(String r : report){
            String[]str = r.split(" ");
            map.get(str[1]).add(str[0]);
        }

        for(int i=0; i<id_list.length; i++){
            HashSet<String>set = map.get(id_list[i]);
            if(set.size() >= k){
                for(String userId :set){
                    answer[idMap.get(userId)]++;
                }
            }
        }
        return answer;
    }
}
