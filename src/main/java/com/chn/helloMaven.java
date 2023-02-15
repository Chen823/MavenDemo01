package com.chn;

public class helloMaven {
    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        helloMaven helloMaven = new helloMaven();
        int add = helloMaven.add(1, 2);
        System.out.println(add);
    }
}
