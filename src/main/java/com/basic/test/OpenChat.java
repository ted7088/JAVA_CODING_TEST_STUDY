package com.basic.test;

import java.util.*;

public class OpenChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 개수 받기
        int n = Integer.parseInt(scanner.nextLine().trim());
        String[] record = new String[n];
        for (int i = 0; i < n; i++) {
            record[i] = scanner.nextLine();
        }

        // 결과 생성
        String[] result = solution(record);
        for (String msg : result) {
            System.out.println(msg);
        }

        scanner.close();
    }

    public static String[] solution(String[] record) {
        Map<String, String> uidToName = new HashMap<>();
        List<String[]> logs = new ArrayList<>();

        for (String r : record) {
            String[] parts = r.split(" ");
            String command = parts[0], uid = parts[1];

            if (command.equals("Enter")) {
                uidToName.put(uid, parts[2]);
                logs.add(new String[]{uid, "님이 들어왔습니다."});
            } else if (command.equals("Change")) {
                uidToName.put(uid, parts[2]);
            } else if (command.equals("Leave")) {
                logs.add(new String[]{uid, "님이 나갔습니다."});
            }
        }

        String[] answer = new String[logs.size()];
        for (int i = 0; i < logs.size(); i++) {
            answer[i] = uidToName.get(logs.get(i)[0]) + logs.get(i)[1];
        }

        return answer;
    }
}
