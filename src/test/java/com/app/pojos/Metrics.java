
package com.app.pojos;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metrics {

    @SerializedName("yoymaintenancecost")
    @Expose
    private double yoymaintenancecost;
    @SerializedName("depreciation")
    @Expose
    private double depreciation;
    @SerializedName("rentalcount")
    @Expose
    private Rentalcount rentalcount;

    public double getYoymaintenancecost() {
        return yoymaintenancecost;
    }

    public void setYoymaintenancecost(double yoymaintenancecost) {
        this.yoymaintenancecost = yoymaintenancecost;
    }

    public Metrics withYoymaintenancecost(double yoymaintenancecost) {
        this.yoymaintenancecost = yoymaintenancecost;
        return this;
    }

    public double getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(double depreciation) {
        this.depreciation = depreciation;
    }

    public Metrics withDepreciation(double depreciation) {
        this.depreciation = depreciation;
        return this;
    }

    public Rentalcount getRentalcount() {
        return rentalcount;
    }

    public void setRentalcount(Rentalcount rentalcount) {
        this.rentalcount = rentalcount;
    }

    public Metrics withRentalcount(Rentalcount rentalcount) {
        this.rentalcount = rentalcount;
        return this;
    }

	@Override
	public String toString() {
		return "Metrics [yoymaintenancecost=" + yoymaintenancecost + ", depreciation=" + depreciation + ", rentalcount="
				+ rentalcount + "]";
	}

   

}
