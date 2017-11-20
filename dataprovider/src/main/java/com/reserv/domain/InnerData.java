package com.reserv.domain;

import java.util.ArrayList;

public class InnerData {
    public ArrayList<String> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<String> labels) {
        this.labels = labels;
    }

    public ArrayList<ValuesData> getDatasets() {
        return datasets;
    }

    public void setDatasets(ArrayList<ValuesData> datasets) {
        this.datasets = datasets;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    private ArrayList<String> labels = new ArrayList<>();
    private ArrayList<ValuesData> datasets = new ArrayList<>();
    private String backgroundColor = "rgba(171, 0, 0, 0.5)";

    public InnerData() {
        //datasets.add(new ValuesData());
    }
}
