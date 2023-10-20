package com.repeat.coding;

public class test {

    public static void main(String[] args) {

        int[] n= {4,3,5,2,10};
        arr(n);
        for(int i=0;i<5;i++) {
            System.out.println(n[i]);
        }
    }
    public static int[] arr(int[] a) {

        int i,j;
        int sw,temp;
        int n=5;

        if(a[0]==0||a[0]<1)
            return a;

        for(i=0;i<n-1;i++) {
            sw=i;
            for(j=i+1;j<n;j++) {
                if(a[j]>a[sw])
                    sw=j;
            }
            temp=a[i];
            a[i]=a[sw];
            a[sw]=temp;

        }
        return a;
    }
}
