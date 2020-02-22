package com.ketfarkukutya.GoodDeedServer.model;

import java.util.ArrayList;
import java.util.List;

public class FeatureCollection {
    private static final String type = "FeatureCollection";

    private List<Deed> features = new ArrayList<>();

    public FeatureCollection() {
    }

    public FeatureCollection(List<Deed> features) {
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public List<Deed> getFeatures() {
        return features;
    }

    public void setFeatures(List<Deed> features) {
        this.features = features;
    }
}
