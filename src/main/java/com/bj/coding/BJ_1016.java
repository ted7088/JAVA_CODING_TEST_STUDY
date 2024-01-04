package com.bj.coding;

import java.io.*;
import java.util.*;
public class BJ_1016 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long s = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());

        long count = e-s+1;
        boolean[] check = new boolean[(int)count];

        for(long i=2; i*i<=e; i++) {
            long pow = i*i; // 제곱수
            long tmp = s/pow;  // 제곱수로 나눠지나?
            if(s%pow != 0) { // 제곱수 아니면 +1
                tmp += 1;
            }

            for(long j = tmp; j*pow<=e; j++) {
                int canSqrt = (int)(j*pow-s);
                if(!check[canSqrt]) {
                    check[canSqrt] = true; // 나누어 떨어지는 수 범위 초과로 -s 해서 저장
                    count--;
                }
            }
        }
        System.out.println(count);
    }

}
