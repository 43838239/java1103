package com.ocp;

public class Area {

    int w;
    int h;

    void calcAndprint() {
        int sum = w * h;
        System.out.println(sum);
    }

    int calcNotprint() {
        int sum = w * h;
        return sum;

    }
}
