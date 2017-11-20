package com.reserv.domain;


import java.io.Serializable;
import java.util.ArrayList;

public class GraphDataObject {
    public InnerData getData() {
        return data;
    }

    public void setData(InnerData data) {
        this.data = data;
    }

    private InnerData data;

    public GraphDataObject() {
        data = new InnerData();
    }
}

