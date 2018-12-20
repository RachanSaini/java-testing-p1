package com.stackroute;

public class Loop {
    public String loop(int n) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                s+= i;
            }
        }
    return s;
    }
}
