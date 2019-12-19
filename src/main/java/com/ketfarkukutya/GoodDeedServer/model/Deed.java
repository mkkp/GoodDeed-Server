package com.ketfarkukutya.GoodDeedServer.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Document(collection = "deeds")
public class Deed {
    @Id
    private String id = null;

    private String type = "Feature";

    @Valid
    @NotNull
    private DeedGeometry geometry = new DeedGeometry();

    @NotNull
    private String description = null;

    @Valid
    @NotNull
    private DeedCreatedBy createdBy = null;

    @CreatedDate
    private Date createdAt = null;

    @LastModifiedDate
    private Date modifiedAt = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public DeedGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(DeedGeometry geometry) {
        this.geometry = geometry;
    }

    public void setCoordinates(int lon, int lat) {
        this.geometry.setCoordinates(lon, lat);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeedCreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(DeedCreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }
}
