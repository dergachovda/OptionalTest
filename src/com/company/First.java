package com.company;

public class First {
    private Second second;

    public First() {    }

    public First(Second second) {
        this.second = second;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }
}
