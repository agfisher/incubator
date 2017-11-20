package com.reserv.domain;

import java.io.Serializable;

public class Point implements Serializable {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private int x;
    private double y;

    public Point(int x, double y){
        this.x = x;
        this.y = y;
    }
}
