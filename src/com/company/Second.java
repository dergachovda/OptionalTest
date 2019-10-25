package com.company;

import java.util.List;

public class Second {
    private List<Third> thirds;

    public Second() {
    }

    public Second(List<Third> thirds) {
        this.thirds = thirds;
    }

    public List<Third> getThirds() {
        return thirds;
    }

    public void setThirds(List<Third> thirds) {
        this.thirds = thirds;
    }
}
