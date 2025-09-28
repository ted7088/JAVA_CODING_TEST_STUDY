package com.basic.test;

import java.util.*;

public class TravelRoute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //티켓 개수 입력
        int n = sc.nextInt();
        String[][] tickets = new String[n][2];

        for (int i = 0; i < n; i++) {
            tickets[i][0] = sc.next();
            tickets[i][1] = sc.next();
        }

        sc.close();

        Solution solution = new Solution();

    }
}

class Solution {
    List<String> answer = new ArrayList<>();
    boolean[] visited;

    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, Comparator.comparing(o -> o[1])); //알파벳 순으로 정렬
        visited = new boolean[tickets.length];
        dfs("ICN", "ICN", tickets, 0);

        return answer.get(0).split(" ");
    }

    private void dfs(String airport, String path, String[][] tickets, int count) {
        if (count == tickets.length) {
            answer.add(path);

            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if(!visited[i]&&tickets[i][0].equals(airport)){
                visited[i]=true;
                dfs(tickets[i][1], path+" "+tickets[i][1],tickets, count+1);
                visited[i]=false;
            }
        }


    }

}
