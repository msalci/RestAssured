
package com.app.pojos;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rentalcount {

    @SerializedName("lastweek")
    @Expose
    private long lastweek;
    @SerializedName("yeartodate")
    @Expose
    private long yeartodate;

    public long getLastweek() {
        return lastweek;
    }

    public void setLastweek(long lastweek) {
        this.lastweek = lastweek;
    }

    public Rentalcount withLastweek(long lastweek) {
        this.lastweek = lastweek;
        return this;
    }

    public long getYeartodate() {
        return yeartodate;
    }

    public void setYeartodate(long yeartodate) {
        this.yeartodate = yeartodate;
    }

    public Rentalcount withYeartodate(long yeartodate) {
        this.yeartodate = yeartodate;
        return this;
    }

	@Override
	public String toString() {
		return "Rentalcount [lastweek=" + lastweek + ", yeartodate=" + yeartodate + "]";
	}

}
