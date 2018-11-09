package com.be.kafkasample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the regions database table.
 */
@Entity
@Table(name = "regions")
@NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r")
public class Region extends CustomBaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "region_name")
    private String regionName;

    public Region() {
    }

    public Integer getRegionId() {
        return this.regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

}
