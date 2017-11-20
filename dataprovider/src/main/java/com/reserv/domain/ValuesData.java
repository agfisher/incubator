package com.reserv.domain;

import java.util.ArrayList;

public class ValuesData {
    public Integer getLineTension() {
        return lineTension;
    }

    public void setLineTension(Integer lineTension) {
        this.lineTension = lineTension;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList<Point> getData() {
        return data;
    }

    public void setData(ArrayList<Point> data) {
        this.data = data;
    }

    private Integer lineTension;
    private String label;
    private ArrayList<Point> data;

    public ValuesData() {
        lineTension = new Integer(0);
        label = "";
        data = new ArrayList<>();
    }
}
