package com.bj.coding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BJ_24263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Long n= Long.parseLong(br.readLine());
        System.out.println(n*n);
        System.out.println('2');
    }
}
