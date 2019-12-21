
package com.app.pojos;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car {

    @SerializedName("make")
    @Expose
    private String make;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("vin")
    @Expose
    private String vin;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("perdayrent")
    @Expose
    private Perdayrent perdayrent;
    @SerializedName("metrics")
    @Expose
    private Metrics metrics;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Car withMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car withModel(String model) {
        this.model = model;
        return this;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Car withVin(String vin) {
        this.vin = vin;
        return this;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Car withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Perdayrent getPerdayrent() {
        return perdayrent;
    }

    public void setPerdayrent(Perdayrent perdayrent) {
        this.perdayrent = perdayrent;
    }

    public Car withPerdayrent(Perdayrent perdayrent) {
        this.perdayrent = perdayrent;
        return this;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public Car withMetrics(Metrics metrics) {
        this.metrics = metrics;
        return this;
    }

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", vin=" + vin + ", metadata=" + metadata + ", perdayrent="
				+ perdayrent + ", metrics=" + metrics + "]";
	}

    

}
