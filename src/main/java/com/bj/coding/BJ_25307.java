package com.bj.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_25307 {
    private static int[][] board;

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    private static int N;
    private static int M;
    private static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NMK = br.readLine();
        StringTokenizer st = new StringTokenizer(NMK);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        board = new int[N][M];

        int startY = 0;
        int startX = 0;

        int[][] board = new int[N][M];
        //입력값 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer nums = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(nums.nextToken());
                if (num == 4) { //시작점 위치 저장
                    startY = i;
                    startX = j;
                }
                board[i][j] = num;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 3) {
                    //마네킹이 여러개 일 수 있음
                    fillUnreachable(i, j, board);
                }
            }
        }

        int answer = moveOn(startY, startX, board);

        //거리를 음수로 표현했기 때문에 -1을 곱하여 출력한다
        System.out.println(answer * (-1));

    }

    public static void fillUnreachable(int y, int x, int[][] board) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{y, x});

        board[y][x] = 1; //마네킹의 위치부터 변경

        while (!queue.isEmpty()) {
            int[] searchPoint = queue.poll();
            int startX = searchPoint[1];
            int startY = searchPoint[0];

            for (int i = 0; i < 4; i++) {
                int currentX = startX + dx[i];
                int currentY = startY + dy[i];

                //2차원 배열의 경계를 넘어서는 경우
                if (currentX < 0 || currentY < 0 || currentX >= M || currentY >= N) {
                    continue;
                }

                //시작점이거나 이미 방문했던 경우
                if (board[currentY][currentX] == 4 || board[currentY][currentX] == 1) {
                    continue;
                }

                //거리가 마네킹으로부터 K보다 큰 경우
                if (Math.abs(y - currentY) + Math.abs(x - currentX) > K) {
                    continue;
                }

                //위 경우가 아니면 1로 덮는다.
                board[currentY][currentX] = 1;
                queue.add(new int[]{currentY, currentX});
            }
        }
    }

    public static int moveOn(int y, int x, int[][] board) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x, 0}); //탐색 위치의 y, x 좌표와 함께 시작점으로터의 거리를 저장

        board[y][x] = -1; //초기위치 (4) 변경
        //초기 위치를 0이 아닌 -1로 하는 이유는
        //탐색과정에서 값이 0인 영역을 따라 가는데,
        //초기값이 0이면 지나간 지역임을 표기하지 못하기 때문

        //최단거리 반환시 -1이 시작이었던점을 반영해야함

        while (!queue.isEmpty()) {
            int[] movePoint = queue.poll();
            int startX = movePoint[1];
            int startY = movePoint[0];
            int distanceFromStart = movePoint[2] - 1; //이전 거리 -1

            for (int i = 0; i < 4; i++) {
                int currentX = startX + dx[i];
                int currentY = startY + dy[i];

                if (currentX < 0 || currentY < 0 || currentX >= M || currentY >= N) {
                    continue;
                }

                //의자에 도착했다면,
                if (board[currentY][currentX] == 2) {
                    return distanceFromStart; //-1부터 시작했기 때문에 추가적인 거리반영 없이 그냥 반환
                }

                //기둥도 아니고, 이미 지나온 곳이 아닌 경우 (0)
                if (board[currentY][currentX] == 0) {
                    board[currentY][currentX] = distanceFromStart; //시작점과의 거리 반영
                    queue.add(new int[]{currentY, currentX, distanceFromStart});
                    continue;
                }
            }
        }

        return 1;
    }
}
