package com.ketfarkukutya.GoodDeedServer.model;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class DeedGeometry {
    private String type = "Point";

    @NotNull
    private List<Double> coordinates = null;

    public String getType() {
        return type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double lon, double lat) {
        this.coordinates = Arrays.asList(lon, lat);
    }
}
