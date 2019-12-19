package com.ketfarkukutya.GoodDeedServer.model;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class DeedGeometry {
    private String type = "Point";

    @NotNull
    private List<Integer> coordinates = null;

    public String getType() {
        return type;
    }

    public List<Integer> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int lon, int lat) {
        this.coordinates = Arrays.asList(lon, lat);
    }
}
