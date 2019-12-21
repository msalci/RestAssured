
package com.app.pojos;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("Color")
    @Expose
    private String color;
    @SerializedName("Notes")
    @Expose
    private String notes;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Metadata withColor(String color) {
        this.color = color;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Metadata withNotes(String notes) {
        this.notes = notes;
        return this;
    }

	@Override
	public String toString() {
		return "Metadata [color=" + color + ", notes=" + notes + "]";
	}

   

}
